package cl.isl.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "SUCURSALES")
@Entity
@Table(name="sucursal")
public class Sucursal {
	
	@Id
	private Integer idSucursal;
	
	@Column(name="glosa_sucursal")
	private String glosaSucursal;
	
	@ManyToOne
	@JoinColumn(name="id_region", nullable = false, foreignKey = @ForeignKey(name = "FK_id_region"))
	private Region region;

	public Integer getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getGlosaSucursal() {
		return glosaSucursal;
	}

	public void setGlosaSucursal(String glosaSucursal) {
		this.glosaSucursal = glosaSucursal;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	

}
