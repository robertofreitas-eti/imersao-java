package br.com.projetofinal.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@RestController
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioDAO usuarioDao;
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listaUsuarios() {
		List<Usuario> usuarios = (List<Usuario>)usuarioDao.findAll();
		
		if (usuarios.size() > 0) {
			return ResponseEntity.ok(usuarios);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Usuario>> listaUsuario(@PathVariable(value = "id") Integer id) {
		Optional<Usuario> usuario = usuarioDao.findById(id);
		if (!usuario.isEmpty()) {
			return ResponseEntity.ok().body(usuario);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public ResponseEntity<Optional<Usuario>> obtemUsuario(@RequestParam(value = "nome") String nome) {
		Optional<Usuario> usuario = usuarioDao.searchByNomeBind(nome);
		if (!usuario.isEmpty()) {
			return ResponseEntity.ok().body(usuario);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
		
	
	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public ResponseEntity<Usuario> incluiUsuario(@RequestBody Usuario usuario) {
		usuario = usuarioDao.save(usuario);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Optional<Usuario>> alterarUsuario(@PathVariable(value = "id") Integer id, @RequestBody Usuario usuarioDto) {
		Optional<Usuario> usuario = usuarioDao.findById(id);
		if (!usuario.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> apagarUsuario(@PathVariable(value = "id") Integer id) {
		try {
			usuarioDao.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
		
	}

}
