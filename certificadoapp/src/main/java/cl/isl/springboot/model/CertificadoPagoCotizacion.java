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

@ApiModel(description = "INFORMACION QUE CONTIENE REQUIERE EL CERTIFICADO")
@Entity
@Table(name="certificado_pago_cotizacion")
public class CertificadoPagoCotizacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_certificado")
	private Integer idCertificado;
	
	@ManyToOne
	@JoinColumn(name="id_empresa", nullable=false, foreignKey = @ForeignKey(name = "FK_consulta_empresa"))
	private Empresa empresa;
	
	@Column(name="ultimo_mes_cotizacion", nullable=false)
	private String ultimaCotizacion;
	
	@Column(name="fecha_emision")
	private Date fechaEmision;

	public Integer getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(Integer idCertificado) {
		this.idCertificado = idCertificado;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getUltimaCotizacion() {
		return ultimaCotizacion;
	}

	public void setUltimaCotizacion(String ultimaCotizacion) {
		this.ultimaCotizacion = ultimaCotizacion;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	
}
