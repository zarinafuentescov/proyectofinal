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
import cl.isl.springboot.model.Empresa;
import cl.isl.springboot.service.IEmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

	
	@Autowired
	private IEmpresaService service;
	
	@GetMapping
	public ResponseEntity<List<Empresa>> listar(){
		List<Empresa> lista = service.listar();
		return new ResponseEntity<List<Empresa>>(lista , HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Empresa> listarPorId(@PathVariable("id") Integer id){
		Empresa obj = service.leerPorId(id);
		if(obj.getIdEmpresa()== null) {
			throw new ModeloNotFoundException("NO SE HA ENCONTRADO EL ID "+ id);
		}
		return new ResponseEntity<Empresa>(obj, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Empresa empresa){
		Empresa obj = service.registrar(empresa);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(empresa.getIdEmpresa()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Empresa> modificar(@Valid @RequestBody Empresa empresa){
		Empresa obj = service.modificar(empresa);
		return new ResponseEntity<Empresa>(obj , HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		Empresa obj = service.leerPorId(id);
		if(obj.getIdEmpresa()== null) {
			throw new ModeloNotFoundException("NO SE HA ENCONTRADO EL ID "+ id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(obj , HttpStatus.OK);
	}
	
}
