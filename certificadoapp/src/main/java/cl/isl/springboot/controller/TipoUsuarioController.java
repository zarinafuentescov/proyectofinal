package cl.isl.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.isl.springboot.exception.ModeloNotFoundException;
import cl.isl.springboot.model.TipoUsuario;
import cl.isl.springboot.service.ITipoUsuarioService;

@RestController
@RequestMapping("/tipos")
public class TipoUsuarioController {
	
	@Autowired
    private ITipoUsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<TipoUsuario>> listar(){
		List<TipoUsuario> lista = service.listar();
		return new ResponseEntity<List<TipoUsuario>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoUsuario> listarPorId(@PathVariable("id") Integer id){
		TipoUsuario obj =service.leerPorId(id);
		if(obj.getIdTipoUsuario()==null) {
			throw new ModeloNotFoundException("Id no encontrado "+ id);
		}
		return new ResponseEntity<TipoUsuario>(obj, HttpStatus.OK);
	}
	
	
}
