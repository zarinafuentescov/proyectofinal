package cl.isl.springboot.service;

import java.util.List;

import cl.isl.springboot.model.Sucursal;

public interface ISucursalService extends ICRUD<Sucursal>{
  
	List<Sucursal> listarSucursalPorRegion();
	
}
