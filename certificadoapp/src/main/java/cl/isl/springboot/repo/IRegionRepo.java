package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import cl.isl.springboot.model.Region;


public interface IRegionRepo extends JpaRepository<Region, Integer>{

}
