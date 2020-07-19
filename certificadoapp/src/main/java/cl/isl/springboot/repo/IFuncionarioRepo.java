package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.Funcionario;

public interface IFuncionarioRepo extends JpaRepository<Funcionario, Integer>{

}
