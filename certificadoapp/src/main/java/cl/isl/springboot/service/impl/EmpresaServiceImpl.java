package cl.isl.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.Empresa;
import cl.isl.springboot.repo.IEmpresaRepo;
import cl.isl.springboot.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService{

	@Autowired
	private IEmpresaRepo repo;
	
	@Override
	public Empresa registrar(Empresa emp) {
		return repo.save(emp);
	}

	@Override
	public Empresa modificar(Empresa emp) {
		return repo.save(emp);
	}

	@Override
	public List<Empresa> listar() {
		return repo.findAll();
	}

	@Override
	public Empresa leerPorId(Integer id) {
		Optional<Empresa> op = repo.findById(id);
		return op.isPresent() ? op.get(): new Empresa();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
}
