package cl.isl.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.Region;
import cl.isl.springboot.repo.IRegionRepo;
import cl.isl.springboot.service.IRegionService;

@Service
public class RegionServiceImpl implements IRegionService{
	
	@Autowired
	private IRegionRepo repo;

	@Override
	public Region registrar(Region obj) {
	
		return repo.save(obj);
	}

	@Override
	public Region modificar(Region obj) {
		
		return repo.save(obj);
	}

	@Override
	public List<Region> listar() {
		
		return repo.findAll();
	}

	@Override
	public Region leerPorId(Integer id) {
		Optional<Region> op = repo.findById(id);
		return op.isPresent() ? op.get():new Region();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
	

}
