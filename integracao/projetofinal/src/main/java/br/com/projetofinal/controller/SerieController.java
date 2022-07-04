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

import br.com.projetofinal.beans.Serie;
import br.com.projetofinal.dao.SerieDAO;

@RestController
@CrossOrigin("*")
public class SerieController {

	@Autowired
	private SerieDAO serieDao;
	
	@RequestMapping(value = "/series", method = RequestMethod.GET)
	public ResponseEntity<List<Serie>> listaSeries() {
		List<Serie> series = (List<Serie>)serieDao.findAll();
		
		if (series.size() > 0) {
			return ResponseEntity.ok(series);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "/serie/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Serie>> listaSerie(@PathVariable(value = "id") Integer id) {
		Optional<Serie> serie = serieDao.findById(id);
		if (!serie.isEmpty()) {
			return ResponseEntity.ok().body(serie);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "/serie", method = RequestMethod.GET)
	public ResponseEntity<Optional<Serie>> obtemSerie(@RequestParam(value = "genero") String genero) {
		Optional<Serie> serie = serieDao.searchByGeneroBind(genero);
		if (!serie.isEmpty()) {
			return ResponseEntity.ok().body(serie);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
		
	
	@RequestMapping(value = "/serie", method = RequestMethod.POST)
	public ResponseEntity<Serie> incluiSerie(@RequestBody Serie serie) {
		serie = serieDao.save(serie);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(serie.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@RequestMapping(value = "/serie", method = RequestMethod.PUT)
	public ResponseEntity<Optional<Serie>> alterarSerie(@PathVariable(value = "id") Integer id, @RequestBody Serie serieDto ) {
		Optional<Serie> serie = serieDao.findById(id);
		
		
		if (!serie.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@RequestMapping(value = "/serie/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> apagarSerie(@PathVariable(value = "id") Integer id) {
		try {
			serieDao.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
		
	}

}
