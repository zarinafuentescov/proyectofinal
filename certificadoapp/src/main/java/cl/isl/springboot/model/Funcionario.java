package cl.isl.springboot.model;

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

@ApiModel(description = "FUNCIONARIO QUE REGISTRA A LA EMPRESA")
@Entity
@Table(name="funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_funcionario")
	private Integer IdFuncionario;
	
	//@OneToOne(mappedBy = "funcionario")
	//private Usuario userId;
	
	@Column(name="run_funcionario", nullable=false )
	private String Run;
	
	@Column(name="run_dv", nullable=false)
	private String dv;
	
	@Column(name="nombre", nullable= false)
	private String nombre;
	
	@Column(name="apellido_paterno", nullable=false)
	private String apellidoPaterno;
	
	@Column(name="apellido_materno", nullable=false)
	private String apellidoMaterno;
	
	@ManyToOne
	@JoinColumn(name="id_sucursal", nullable=false, foreignKey = @ForeignKey(name="FK_sucursal"))
	private Sucursal sucursal;

	public Integer getIdFuncionario() {
		return IdFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		IdFuncionario = idFuncionario;
	}


	public String getRun() {
		return Run;
	}

	public void setRun(String run) {
		Run = run;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
}
