package cl.isl.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.Sucursal;
import cl.isl.springboot.repo.ISucursalRepo;
import cl.isl.springboot.service.ISucursalService;

@Service
public class SucursalServiceImpl implements ISucursalService{
	
	@Autowired
	private ISucursalRepo repo;

	@Override
	public Sucursal registrar(Sucursal obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public Sucursal modificar(Sucursal obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public List<Sucursal> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Sucursal leerPorId(Integer id) {
		Optional<Sucursal> op = repo.findById(id);
		return op.isPresent() ? op.get():new Sucursal();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

	@Override
	public List<Sucursal> listarSucursalPorRegion() {
		// TODO Auto-generated method stub
		return null;
	}

}
