package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.Sucursal;

public interface ISucursalRepo extends JpaRepository<Sucursal, Integer>{

}
