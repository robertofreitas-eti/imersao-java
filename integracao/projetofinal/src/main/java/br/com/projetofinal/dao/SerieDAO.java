package br.com.projetofinal.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projetofinal.beans.Serie;

public interface SerieDAO extends CrudRepository<Serie, Integer> {

	@Query("SELECT n FROM Serie n WHERE n.genero LIKE '%:genero%'")
	Optional<Serie> searchByGeneroBind(@Param("genero") String genero);
	
}
