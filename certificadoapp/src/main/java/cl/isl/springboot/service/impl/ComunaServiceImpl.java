package cl.isl.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.Comuna;
import cl.isl.springboot.repo.IComunaRepo;
import cl.isl.springboot.service.IComunaService;

@Service
public class ComunaServiceImpl implements IComunaService{
	
	@Autowired
	private IComunaRepo repo;

	@Override
	public Comuna registrar(Comuna obj) {
		
		return repo.save(obj);
	}

	@Override
	public Comuna modificar(Comuna obj) {
		
		return repo.save(obj);
	}

	@Override
	public List<Comuna> listar() {
		
		return repo.findAll();
	}

	@Override
	public Comuna leerPorId(Integer id) {
		Optional<Comuna> op = repo.findById(id);
		return op.isPresent() ? op.get():new Comuna();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);	
		return true;
	}
	
	
	
}
