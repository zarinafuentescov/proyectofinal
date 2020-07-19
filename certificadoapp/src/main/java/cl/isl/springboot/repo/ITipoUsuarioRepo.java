package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.TipoUsuario;

public interface ITipoUsuarioRepo extends JpaRepository<TipoUsuario, Integer>{

}
