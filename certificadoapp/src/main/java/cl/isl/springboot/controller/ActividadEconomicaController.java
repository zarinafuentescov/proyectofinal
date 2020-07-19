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
import cl.isl.springboot.model.ActividadEconomica;
import cl.isl.springboot.service.IActividadEconomicaService;

@RestController
@RequestMapping("/actividades")
public class ActividadEconomicaController {
	
	@Autowired
	private IActividadEconomicaService service;
	
	@GetMapping
	public ResponseEntity<List<ActividadEconomica>> listar(){
		List<ActividadEconomica> lista = service.listar();
		return new ResponseEntity<List<ActividadEconomica>>(lista , HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ActividadEconomica> listarPorId(@PathVariable("id") Integer id){
		ActividadEconomica obj = service.leerPorId(id);
		if(obj.getIdActividad() == null) {
			throw new ModeloNotFoundException("Id no encontrado "+ id);
		}
		return new ResponseEntity<ActividadEconomica>(obj , HttpStatus.OK);
		
	}
/*	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody ActividadEconomica actividad){
		ActividadEconomica obj = service.registrar(actividad);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(actividad.getIdActividad()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<ActividadEconomica> modificar(@Valid @RequestBody ActividadEconomica actividad){
		ActividadEconomica obj = service.modificar(actividad);
		return new ResponseEntity<ActividadEconomica>(obj , HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		ActividadEconomica obj = service.leerPorId(id);
		if(obj.getIdActividad() == null) {
			throw new ModeloNotFoundException("Id no encontrado "+ id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(obj, HttpStatus.OK);
	}
	*/
}
