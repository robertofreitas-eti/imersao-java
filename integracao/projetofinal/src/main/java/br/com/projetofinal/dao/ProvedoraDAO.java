package br.com.projetofinal.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projetofinal.beans.Provedora;

public interface ProvedoraDAO extends CrudRepository<Provedora, Integer> {

	@Query("SELECT n FROM Provedora n WHERE n.nome LIKE '%:nome%'")
	Optional<Provedora> searchByNomeBind(@Param("nome") String nome);
	
}
