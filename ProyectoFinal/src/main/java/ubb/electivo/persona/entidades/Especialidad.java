package ubb.electivo.persona.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ESPECIALIDAD", schema = "PERSONA")

public class Especialidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "DESCRIPCION")
	private String DESCRIPCION;
	
	@Column(name = "ACTIVO")
	private Integer ACTIVO;

	
	public Especialidad() {
		
	}
	
	public Especialidad(Long id, String dESCRIPCION, Integer aCTIVO) {
		super();
		this.id = id;
		this.DESCRIPCION = dESCRIPCION;
		this.ACTIVO = aCTIVO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDESCRIPCION() {
		return DESCRIPCION;
	}

	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}

	public Integer getACTIVO() {
		return ACTIVO;
	}

	public void setACTIVO(Integer aCTIVO) {
		ACTIVO = aCTIVO;
	}

	@Override
	public String toString() {
		return "Especialidad [id=" + id + ", DESCRIPCION=" + DESCRIPCION + ", ACTIVO=" + ACTIVO + "]";
	}
	
	
	
	
	
	
}
