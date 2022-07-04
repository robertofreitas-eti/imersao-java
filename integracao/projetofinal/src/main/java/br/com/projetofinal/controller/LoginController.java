package br.com.projetofinal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@RestController
@CrossOrigin("*")
public class LoginController {

	@Autowired
	private UsuarioDAO usuarioDao;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody Usuario usuario) {
		Usuario usuarioEmail = usuarioDao.findByEmail(usuario.getEmail());
		
		Map<String, String> loginResponse = new HashMap<>();
		
		if (usuarioEmail.getSenha().contentEquals(usuario.getSenha())) {
			return new ResponseEntity<>(usuarioEmail , HttpStatus.OK);
		} else {
		    loginResponse.put("message", "Não autorizado");
		    loginResponse.put("status", "401");
			return new ResponseEntity<>(loginResponse , HttpStatus.UNAUTHORIZED);
		}
	}
	
}
