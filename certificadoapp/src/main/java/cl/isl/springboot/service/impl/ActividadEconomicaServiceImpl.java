package cl.isl.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.ActividadEconomica;
import cl.isl.springboot.repo.IActividadEconomicaRepo;
import cl.isl.springboot.service.IActividadEconomicaService;

@Service
public class ActividadEconomicaServiceImpl implements IActividadEconomicaService{
	
	@Autowired
	private IActividadEconomicaRepo repo;

	@Override
	public ActividadEconomica registrar(ActividadEconomica obj) {
		
		return repo.save(obj);
	}

	@Override
	public ActividadEconomica modificar(ActividadEconomica obj) {
		
		return repo.save(obj);
	}

	@Override
	public List<ActividadEconomica> listar() {
		
		return repo.findAll();
	}

	@Override
	public ActividadEconomica leerPorId(Integer id) {
		Optional<ActividadEconomica> op = repo.findById(id);
		return op.isPresent() ? op.get(): new ActividadEconomica();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
	

}
