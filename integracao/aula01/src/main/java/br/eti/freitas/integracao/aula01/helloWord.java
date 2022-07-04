package br.eti.freitas.integracao.aula01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class helloWord {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ResponseEntity<String> helloWord () {
		return ResponseEntity.ok().body("Bem vindo!");	
	}
}
