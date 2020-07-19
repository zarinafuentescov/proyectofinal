package cl.isl.springboot.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cl.isl.springboot.exception.ModeloNotFoundException;
import cl.isl.springboot.model.Funcionario;
import cl.isl.springboot.service.IFuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private IFuncionarioService service;

	@GetMapping
	public ResponseEntity<List<Funcionario>> listar(){
		List<Funcionario> lista = service.listar();
		return new ResponseEntity<List<Funcionario>>(lista , HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> listarPorId(@PathVariable("id") Integer id){
		Funcionario obj = service.leerPorId(id);
		if(obj.getIdFuncionario() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		return new ResponseEntity<Funcionario>(obj , HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Funcionario funcionario){
		Funcionario obj = service.registrar(funcionario);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(funcionario.getIdFuncionario()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Funcionario> modificar(@Valid @RequestBody Funcionario funcionario){
		Funcionario obj = service.modificar(funcionario);
		return new ResponseEntity<Funcionario>(obj, HttpStatus.OK); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		Funcionario obj = service.leerPorId(id);
		if(obj.getIdFuncionario() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(obj , HttpStatus.OK);
	}
	
}
