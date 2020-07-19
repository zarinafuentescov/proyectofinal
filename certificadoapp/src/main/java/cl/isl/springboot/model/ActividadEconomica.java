package cl.isl.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "ACTIVIDADES ECONOMICAS ASOCIADAS A LA EMPRESA")
@Entity
@Table(name="actividad_economica")
public class ActividadEconomica {
	
	@Id
	@Column(name="id_actividad")
	private Integer idActividad;
	
	@Column(name="codigo_actividad")
	private String codigoActividad;
	
	@Column(name="glosa_actividad")
	private String glosaActividad;
	
	@Column(name="tasa_presunta")
	private float tasa;

	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	public String getCodigoActividad() {
		return codigoActividad;
	}

	public void setCodigoActividad(String codigoActividad) {
		this.codigoActividad = codigoActividad;
	}

	public String getGlosaActividad() {
		return glosaActividad;
	}

	public void setGlosaActividad(String glosaActividad) {
		this.glosaActividad = glosaActividad;
	}

	public float getTasa() {
		return tasa;
	}

	public void setTasa(float tasa) {
		this.tasa = tasa;
	}

	

}
