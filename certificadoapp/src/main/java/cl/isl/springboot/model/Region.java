package cl.isl.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "REGIONES")
@Entity
@Table(name="region")
public class Region {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id_region")
	private Integer idRegion;
	
	
	//@Column(name="codigo_region") 
	//private String codigoRegion;
	
	@Column(name="nombre_region")
	private String nombre;

	public Integer getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

/*	public String getCodigoRegion() {
		return codigoRegion;
	}

	public void setCodigoRegion(String codigoRegion) {
		this.codigoRegion = codigoRegion;
	} */
	
}
