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

import br.com.projetofinal.beans.Provedora;
import br.com.projetofinal.dao.ProvedoraDAO;

@RestController
@CrossOrigin("*")
public class ProvedoraController {


	@Autowired
	private ProvedoraDAO provedoraDao;
	
	@RequestMapping(value = "/provedoras", method = RequestMethod.GET)
	public ResponseEntity<List<Provedora>> listaProvedoras() {
		List<Provedora> provedoras = (List<Provedora>)provedoraDao.findAll();
		
		if (provedoras.size() > 0) {
			return ResponseEntity.ok(provedoras);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "/provedora/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Provedora>> listaProvedora(@PathVariable(value = "id") Integer id) {
		Optional<Provedora> provedora = provedoraDao.findById(id);
		if (!provedora.isEmpty()) {
			return ResponseEntity.ok().body(provedora);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "/provedora", method = RequestMethod.GET)
	public ResponseEntity<Optional<Provedora>> obtemProvedora(@RequestParam(value = "titulo") String titulo) {
		Optional<Provedora> provedora = provedoraDao.searchByNomeBind(titulo);
		if (!provedora.isEmpty()) {
			return ResponseEntity.ok().body(provedora);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
		
	
	@RequestMapping(value = "/provedora", method = RequestMethod.POST)
	public ResponseEntity<Provedora> incluiProvedora(@RequestBody Provedora provedora) {
		provedora = provedoraDao.save(provedora);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(provedora.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@RequestMapping(value = "/provedora/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Optional<Provedora>> alterarProvedora(@PathVariable(value = "id") Integer id, @RequestBody Provedora provedoraDto ) {
		Optional<Provedora> provedora = provedoraDao.findById(id);
		if (!provedora.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@RequestMapping(value = "/provedora/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> apagarProvedora(@PathVariable(value = "id") Integer id) {
		try {
			provedoraDao.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
		
	}

}
