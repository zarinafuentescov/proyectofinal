package cl.isl.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "INFORMACION DE LA EMPRESA")
@Entity
@Table(name="empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_empresa")
	private Integer idEmpresa;
	
	@Column(name="razon_social", nullable=false)
	private String razonSocial;
	
	@Column(name="direccion", nullable=false)
	private String direccion;
	
	@ManyToOne
	@JoinColumn(name="id_comuna", nullable= false, foreignKey = @ForeignKey(name="FK_comuna"))
	private Comuna comuna;
	
	@Column(name="rut_empresa", nullable=false)
	private String rut;
	
	@Column(name="dv_empresa", nullable=false)
	private String dv;
	
	@ManyToOne
	@JoinColumn(name="id_actividad", nullable= false, foreignKey = @ForeignKey(name="FK_actividad"))
	private ActividadEconomica actividad;
	
			
	@Column(name="fecha_registro")
	private Date fechaRegistro;


	public Integer getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Comuna getComuna() {
		return comuna;
	}


	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getDv() {
		return dv;
	}


	public void setDv(String dv) {
		this.dv = dv;
	}


	public ActividadEconomica getActividad() {
		return actividad;
	}


	public void setActividad(ActividadEconomica actividad) {
		this.actividad = actividad;
	}


	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	
	
}
