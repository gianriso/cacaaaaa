package ubb.electivo.persona.entidades;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "DECORADOR", schema = "PERSONA")
public class Decorador {
	
	

	@Id
	private String RUT_DECORADOR;
	
	@Column(name = "ACTIVO")
	private Integer ACTIVO;
	
	@ManyToOne
	private Persona PERSONA;
	
	@ManyToOne
	private Especialidad ESPECIALIDAD;
	
	public Decorador() {
		
	}

	public Decorador(String rUT_DECORADOR, Integer aCTIVO, Persona pERSONA, Especialidad eSPECIALIDAD) {
		super();
		this.RUT_DECORADOR = rUT_DECORADOR;
		this.ACTIVO = aCTIVO;
		this.PERSONA = pERSONA;
		this.ESPECIALIDAD = eSPECIALIDAD;
	}

	public String getRUT_DECORADOR() {
		return RUT_DECORADOR;
	}

	public void setRUT_DECORADOR(String rUT_DECORADOR) {
		RUT_DECORADOR = rUT_DECORADOR;
	}

	public Integer getACTIVO() {
		return ACTIVO;
	}

	public void setACTIVO(Integer aCTIVO) {
		ACTIVO = aCTIVO;
	}

	public Persona getPERSONA() {
		return PERSONA;
	}

	public void setPERSONA(Persona pERSONA) {
		PERSONA = pERSONA;
	}

	public Especialidad getESPECIALIDAD() {
		return ESPECIALIDAD;
	}

	public void setESPECIALIDAD(Especialidad eSPECIALIDAD) {
		ESPECIALIDAD = eSPECIALIDAD;
	}

	@Override
	public String toString() {
		return "Decorador [RUT_DECORADOR=" + RUT_DECORADOR + ", ACTIVO=" + ACTIVO + ", PERSONA=" + PERSONA
				+ ", ESPECIALIDAD=" + ESPECIALIDAD + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
