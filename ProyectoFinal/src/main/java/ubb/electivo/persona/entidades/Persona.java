package ubb.electivo.persona.entidades;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONA", schema = "PERSONA")

public class Persona {

	@Id
	private String RUT;
	
	@Column(name = "PRIMER_NOMBRE")
	private String PRIMER_NOMBRE;
	
	@Column(name = "SEGUNDO_NOMBRE")
	private String SEGUNDO_NOMBRE;
	
	@Column(name = "PRIMER_APELLIDO")
	private String PRIMER_APELLIDO;
	
	@Column(name = "SEGUNDO_APELLIDO")
	private String SEGUNDO_APELLIDO;
	
	@Column(name = "NUMERO_TEF")
	private String NUMERO_TEF;
	
	@Column(name = "DIRECCION")
	private String DIRECCION;
	
	@Column(name = "FECHA_NAC")
	private Date FECHA_NAC;
	
	@Column(name = "ACTIVO")
	private Integer ACTIVO;

	@ManyToOne
	private Ciudad CIUDAD;
	
	public Persona() {
		
	}

	public Persona(String rUT, String pRIMER_NOMBRE, String sEGUNDO_NOMBRE, String pRIMER_APELLIDO,
			String sEGUNDO_APELLIDO, String nUMERO_TEF, String dIRECCION, Date fECHA_NAC, Integer aCTIVO,
			Ciudad cIUDAD) {
		super();
		this.RUT = rUT;
		this.PRIMER_NOMBRE = pRIMER_NOMBRE;
		this.SEGUNDO_NOMBRE = sEGUNDO_NOMBRE;
		this.PRIMER_APELLIDO = pRIMER_APELLIDO;
		this.SEGUNDO_APELLIDO = sEGUNDO_APELLIDO;
		this.NUMERO_TEF = nUMERO_TEF;
		this.DIRECCION = dIRECCION;
		this.FECHA_NAC = fECHA_NAC;
		this.ACTIVO = aCTIVO;
		this.CIUDAD = cIUDAD;
	}

	public String getRUT() {
		return RUT;
	}

	public void setRUT(String rUT) {
		RUT = rUT;
	}

	public String getPRIMER_NOMBRE() {
		return PRIMER_NOMBRE;
	}

	public void setPRIMER_NOMBRE(String pRIMER_NOMBRE) {
		PRIMER_NOMBRE = pRIMER_NOMBRE;
	}

	public String getSEGUNDO_NOMBRE() {
		return SEGUNDO_NOMBRE;
	}

	public void setSEGUNDO_NOMBRE(String sEGUNDO_NOMBRE) {
		SEGUNDO_NOMBRE = sEGUNDO_NOMBRE;
	}

	public String getPRIMER_APELLIDO() {
		return PRIMER_APELLIDO;
	}

	public void setPRIMER_APELLIDO(String pRIMER_APELLIDO) {
		PRIMER_APELLIDO = pRIMER_APELLIDO;
	}

	public String getSEGUNDO_APELLIDO() {
		return SEGUNDO_APELLIDO;
	}

	public void setSEGUNDO_APELLIDO(String sEGUNDO_APELLIDO) {
		SEGUNDO_APELLIDO = sEGUNDO_APELLIDO;
	}

	public String getNUMERO_TEF() {
		return NUMERO_TEF;
	}

	public void setNUMERO_TEF(String nUMERO_TEF) {
		NUMERO_TEF = nUMERO_TEF;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public Date getFECHA_NAC() {
		return FECHA_NAC;
	}

	public void setFECHA_NAC(Date fECHA_NAC) {
		FECHA_NAC = fECHA_NAC;
	}

	public Integer getACTIVO() {
		return ACTIVO;
	}

	public void setACTIVO(Integer aCTIVO) {
		ACTIVO = aCTIVO;
	}

	public Ciudad getCIUDAD() {
		return CIUDAD;
	}

	public void setCIUDAD(Ciudad cIUDAD) {
		CIUDAD = cIUDAD;
	}

	@Override
	public String toString() {
		return "Persona [RUT=" + RUT + ", PRIMER_NOMBRE=" + PRIMER_NOMBRE + ", SEGUNDO_NOMBRE=" + SEGUNDO_NOMBRE
				+ ", PRIMER_APELLIDO=" + PRIMER_APELLIDO + ", SEGUNDO_APELLIDO=" + SEGUNDO_APELLIDO + ", NUMERO_TEF="
				+ NUMERO_TEF + ", DIRECCION=" + DIRECCION + ", FECHA_NAC=" + FECHA_NAC + ", ACTIVO=" + ACTIVO
				+ ", CIUDAD=" + CIUDAD + "]";
	}


	
	
	
}
