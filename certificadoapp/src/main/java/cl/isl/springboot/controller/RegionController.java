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
import cl.isl.springboot.model.Region;
import cl.isl.springboot.service.IRegionService;

@RestController
@RequestMapping("/regiones")
public class RegionController {
	
	@Autowired
	private IRegionService service;
	
	@GetMapping
	public  ResponseEntity<List<Region>> listar(){
		List<Region> lista = service.listar();
		return new ResponseEntity<List<Region>>(lista, HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Region> listarPorId( @PathVariable("id") Integer id){
	   Region obj = service.leerPorId(id);
	   if(obj.getIdRegion()== null) {
		   throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
	   }
	   return new ResponseEntity<Region>(obj, HttpStatus.OK);
	}

	/*
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Region region){
		
		Region obj = service.registrar(region);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(region.getIdRegion()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Region> modificar(@Valid @RequestBody Region region){
		
		Region obj = service.modificar(region);
		return new ResponseEntity<Region>(obj , HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		Region obj = service.leerPorId(id);
		if(obj.getIdRegion() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(obj , HttpStatus.OK);
	}*/
	
	
}
