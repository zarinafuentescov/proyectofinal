package cl.isl.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.Funcionario;
import cl.isl.springboot.repo.IFuncionarioRepo;
import cl.isl.springboot.service.IFuncionarioService;

@Service
public class FuncionarioServiceImpl implements IFuncionarioService{
	
	@Autowired
	private IFuncionarioRepo repo;

	@Override
	public Funcionario registrar(Funcionario obj) {
		
		return repo.save(obj);
	}

	@Override
	public Funcionario modificar(Funcionario obj) {
		
		return repo.save(obj);
	}

	@Override
	public List<Funcionario> listar() {
		
		return repo.findAll();
	}

	@Override
	public Funcionario leerPorId(Integer id) {
		Optional<Funcionario> op = repo.findById(id);
		return op.isPresent() ? op.get():new Funcionario();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
}
