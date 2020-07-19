package cl.isl.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.Token;
import cl.isl.springboot.repo.ITokenRepo;
import cl.isl.springboot.service.ITokenService;

@Service
public class TokenServiceImpl implements ITokenService{
	
	@Autowired
	private ITokenRepo repo;
	
	@Override
	public Token findByToken(String token) {
		
		return repo.findByToken(token);
	}

	@Override
	public void guardar(Token token) {
		
		repo.save(token);
	}

	@Override
	public void eliminar(Token token) {
		
		repo.delete(token);
	}

}
