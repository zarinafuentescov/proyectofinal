package cl.isl.springboot.service;

import cl.isl.springboot.model.Token;

public interface ITokenService {
	
	Token findByToken(String token);
    void guardar(Token token);
	void eliminar(Token token);
	
}
