package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.ActividadEconomica;

public interface IActividadEconomicaRepo extends JpaRepository<ActividadEconomica, Integer>{

}
