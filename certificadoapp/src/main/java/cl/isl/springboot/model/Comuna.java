package cl.isl.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "COMUNAS")
@Entity
@Table(name="comuna")
public class Comuna {
	
	@Id
	@Column(name="id_comuna")
	private Integer idComuna;
	
	@ManyToOne
	@JoinColumn(name="id_region", nullable=false,  foreignKey = @ForeignKey(name="FK_Region"))
	private Region region;
	
	@Column(name="nombre_comuna")
	private String nombre;

	public Integer getIdComuna() {
		return idComuna;
	}

	public void setIdComuna(Integer idComuna) {
		this.idComuna = idComuna;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
