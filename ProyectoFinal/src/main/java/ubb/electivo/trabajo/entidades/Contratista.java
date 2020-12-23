package ubb.electivo.trabajo.entidades;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "CONTRATISTA", schema="TRABAJO")



/*
 * 
 * 	RUT_CONTRATISTA CHARACTER VARYING(12) NOT NULL,
	PRIMER_NOMBRE CHARACTER VARYING(255),
	SEGUNDO_NOMBRE CHARACTER VARYING(255),
	PRIMER_APELLIDO CHARACTER VARYING(255),
	SEGUNDO_APELLIDO CHARACTER VARYING(255),
	NUMERO_CONTACTO CHARACTER VARYING(12),
	ACTIVO INT,
    CONSTRAINT PK_CONTRATISTA PRIMARY KEY (RUT_CONTRATISTA)

 * */




public class Contratista {

	
	@Column(name = "RUT_CONTRATISTA")
	private String RUT_CONTRATISTA;
	
	@Column(name = "PRIMER_NOMBRE")
	private String PRIMER_NOMBRE;
	
	
	@Column(name = "SEGUNDO_NOMBRE")
	private String SEGUNDO_NOMBRE;

	
	@Column(name = "PRIMER_APELLIDO")
	private String PRIMER_APELLIDO;
	
	@Column(name = "SEGUNDO_APELLIDO")
	private String SEGUNDO_APELLIDO;
	
	
	@Column(name = "NUMERO_CONTACTO")
	private String NUMERO_CONTACTO;
	
	
	@Column(name= "ACTIVO")
	private Integer activo;


	
	public Contratista() {
		
	}
	
	public Contratista(String rUT_CONTRATISTA, String pRIMER_NOMBRE, String sEGUNDO_NOMBRE, String pRIMER_APELLIDO,
			String sEGUNDO_APELLIDO, String nUMERO_CONTACTO, Integer activo) {
		super();
		this.RUT_CONTRATISTA = rUT_CONTRATISTA;
		this.PRIMER_NOMBRE = pRIMER_NOMBRE;
		this.SEGUNDO_NOMBRE = sEGUNDO_NOMBRE;
		this.PRIMER_APELLIDO = pRIMER_APELLIDO;
		this.SEGUNDO_APELLIDO = sEGUNDO_APELLIDO;
		this.NUMERO_CONTACTO = nUMERO_CONTACTO;
		this.activo = activo;
	}

	public String getRUT_CONTRATISTA() {
		return RUT_CONTRATISTA;
	}

	public void setRUT_CONTRATISTA(String rUT_CONTRATISTA) {
		RUT_CONTRATISTA = rUT_CONTRATISTA;
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

	public String getNUMERO_CONTACTO() {
		return NUMERO_CONTACTO;
	}

	public void setNUMERO_CONTACTO(String nUMERO_CONTACTO) {
		NUMERO_CONTACTO = nUMERO_CONTACTO;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Contratista [RUT_CONTRATISTA=" + RUT_CONTRATISTA + ", PRIMER_NOMBRE=" + PRIMER_NOMBRE
				+ ", SEGUNDO_NOMBRE=" + SEGUNDO_NOMBRE + ", PRIMER_APELLIDO=" + PRIMER_APELLIDO + ", SEGUNDO_APELLIDO="
				+ SEGUNDO_APELLIDO + ", NUMERO_CONTACTO=" + NUMERO_CONTACTO + ", activo=" + activo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
