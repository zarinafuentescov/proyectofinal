package cl.isl.springboot.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cl.isl.springboot.dto.ConsultaCertificadoDTO;
import cl.isl.springboot.exception.ModeloNotFoundException;
import cl.isl.springboot.model.CertificadoPagoCotizacion;
import cl.isl.springboot.service.ICertificadoPagoCotizacionService;

@RestController
@RequestMapping("/certificados")
public class CertificadoPagoCotizacionController {
	
	@Autowired
	private ICertificadoPagoCotizacionService service;
	
	@GetMapping
	public ResponseEntity<List<CertificadoPagoCotizacion>> listar(){
		
		List<CertificadoPagoCotizacion> lista = service.listar();
		return new ResponseEntity<List<CertificadoPagoCotizacion>>(lista , HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CertificadoPagoCotizacion> listarPorId(@PathVariable("id") Integer id){
		CertificadoPagoCotizacion obj = service.leerPorId(id);
		if(obj.getIdCertificado()==null) {
			throw new ModeloNotFoundException("El id no se encuentra " + id);
		}
		return new ResponseEntity<CertificadoPagoCotizacion>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody CertificadoPagoCotizacion consulta){
		
		CertificadoPagoCotizacion obj =service.registrar(consulta);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdCertificado()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<CertificadoPagoCotizacion> modificar(@Valid @RequestBody CertificadoPagoCotizacion  certificado){
		CertificadoPagoCotizacion obj = service.modificar(certificado);
		return new ResponseEntity<CertificadoPagoCotizacion>(obj,HttpStatus.OK);
		
	}
	
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		
		CertificadoPagoCotizacion obj = service.leerPorId(id);
		if(obj.getIdCertificado()==null) {
			throw new ModeloNotFoundException("El id no se encuentra "+ id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	

}
