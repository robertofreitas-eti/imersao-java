package br.com.projetofinal.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projetofinal.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	Usuario findByEmail(String email);

	@Query("SELECT n FROM Usuario n WHERE n.nome LIKE '%:nome%'")
	Optional<Usuario> searchByNomeBind(@Param("nome") String nome);
}
