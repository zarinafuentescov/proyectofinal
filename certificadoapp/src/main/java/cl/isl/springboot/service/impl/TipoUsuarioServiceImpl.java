package cl.isl.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.TipoUsuario;
import cl.isl.springboot.repo.ITipoUsuarioRepo;
import cl.isl.springboot.service.ITipoUsuarioService;

@Service
public class TipoUsuarioServiceImpl implements ITipoUsuarioService{
	
	@Autowired
	private ITipoUsuarioRepo repo;

	@Override
	public TipoUsuario registrar(TipoUsuario obj) {
		
		return repo.save(obj);
	}

	@Override
	public TipoUsuario modificar(TipoUsuario obj) {
		
		return repo.save(obj);
	}

	@Override
	public List<TipoUsuario> listar() {
		
		return repo.findAll();
	}

	@Override
	public TipoUsuario leerPorId(Integer id) {
		Optional<TipoUsuario> op = repo.findById(id);
		return op.isPresent() ? op.get():new TipoUsuario();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
