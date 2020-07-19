package cl.isl.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "TIPOS DE USUARIOS")
@Entity
@Table(name="tipo_usuario")
public class TipoUsuario {
	
	 @Id
	 @Column(name="id_tipo_usuario")
	 private Integer idTipoUsuario;
	 
	 @Column(name="glosa_tipo_usuario")
	 private String glosaTipousuario;

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getGlosaTipousuario() {
		return glosaTipousuario;
	}

	public void setGlosaTipousuario(String glosaTipousuario) {
		this.glosaTipousuario = glosaTipousuario;
	}

	
	 
	 
}
