package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.Empresa;

public interface IEmpresaRepo extends JpaRepository<Empresa, Integer>{

}
