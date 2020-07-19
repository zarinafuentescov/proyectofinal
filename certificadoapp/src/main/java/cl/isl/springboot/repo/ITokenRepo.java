package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.Token;

public interface ITokenRepo extends JpaRepository<Token,Integer>{

	Token findByToken(String token);
	
}
