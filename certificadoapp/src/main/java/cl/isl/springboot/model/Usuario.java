package cl.isl.springboot.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "DATOS DE USUARIO")
@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name="id_usuario")
	private Integer idUsuario;
	
	@Column(name="usuario", nullable=false, unique=true)
	private String  username;
	
	@Column(name="password", nullable=false)
	private String  password;
	
	@Column(name="activo")
	private Boolean userActivo;
	
	@Email
	@Column(name="email", nullable=false)
	private String  userEmail;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="usuarios_tipos", joinColumns = @JoinColumn(name="id_usuario"), inverseJoinColumns = @JoinColumn(name="id_tipo_usuario"))
	private List<TipoUsuario> tipoUsuario;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getUserActivo() {
		return userActivo;
	}

	public void setUserActivo(Boolean userActivo) {
		this.userActivo = userActivo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<TipoUsuario> getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(List<TipoUsuario> tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	

	
	
	

}
