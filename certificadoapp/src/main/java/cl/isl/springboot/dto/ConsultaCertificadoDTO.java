package cl.isl.springboot.dto;

import java.util.Date;

import cl.isl.springboot.model.Empresa;
import cl.isl.springboot.model.Usuario;

public class ConsultaCertificadoDTO {
	
	private Integer idCertificado;
	
    private String ultimaCotizacion;
	
	private Date fechaEmision;
	
	private Empresa empresa;
	
	private Usuario usuario;
	
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
