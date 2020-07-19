package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findOneByUsername(String username);
	
}
