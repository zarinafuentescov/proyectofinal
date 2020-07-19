package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.Comuna;

public interface IComunaRepo extends JpaRepository<Comuna, Integer>{

}
