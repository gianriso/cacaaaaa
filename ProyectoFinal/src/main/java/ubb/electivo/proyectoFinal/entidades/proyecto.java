package ubb.electivo.proyectoFinal.entidades;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ubb.electivo.persona.entidades.Cliente;
import ubb.electivo.persona.entidades.Decorador;



@Entity
@Table(name = "PROYECTO", schema="PROYECTO")


public class proyecto {
	
	
	
	/*CODIGO SQL
	 * 
	 * 
		ID SERIAL NOT NULL,
		TIPO_PROYECTO_ID SERIAL NOT NULL,
		FECHA_INICIO DATE,
		TIEMPO_ESTIMADO INT,
		COSTO_ESTIMADO INT,
		TIEMPO_REAL_TRABAJO INT,
		COSTO_REAL INT,
		FECHA_FIN DATE,
		RUT_CLIENTE CHARACTER VARYING(12) NOT NULL,
		RUT_DECORADOR CHARACTER VARYING(12) NOT NULL,
		ACTIVO INT, 
		
		
		
		    CONSTRAINT PK_PROYECTO PRIMARY KEY (ID),
			CONSTRAINT FK_CLIENTE FOREIGN KEY (RUT_CLIENTE) REFERENCES PERSONA.CLIENTE(RUT_CLIENTE), 
    		CONSTRAINT FK_DECORADOR FOREIGN KEY (RUT_DECORADOR) REFERENCES PERSONA.DECORADOR(RUT_DECORADOR),
    		CONSTRAINT FK_TIPO_PROYECTO FOREIGN KEY (TIPO_PROYECTO_ID) REFERENCES PROYECTO.TIPO_PROYECTO(ID) 
		
		*/	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private TipoProyecto TIPO_PROYECTO_ID;
	
	@Column(name = "FECHA_INICIO")
	private Date FECHA_INICIO;
	
	@Column(name = "TIEMPO_ESTIMADO")
	private Integer TIEMPO_ESTIMADO;
	
	
	@Column(name = "COSTO_ESTIMADO")
	private Integer COSTO_ESTIMADO;
	
	@Column(name = "TIEMPO_REAL_TRABAJO")
	private Integer TIEMPO_REAL_TRABAJO;
	
	
	@Column(name="COSTO_REAL")
	private Integer COSTO_REAL;
	
	@Column(name="FECHA_FIN")
	private Date FECHA_FIN;
	
	@ManyToOne
	private Cliente RUT_CLIENTE;
	@ManyToOne
	private Decorador RUT_DECORADOR;
	
	@Column(name = "activo")
	private Integer activo;
	
	
	
	public proyecto() {
		
	}
	
	public proyecto(Long id, TipoProyecto tIPO_PROYECTO_ID, Date fECHA_INICIO, Integer tIEMPO_ESTIMADO,
			Integer cOSTO_ESTIMADO, Integer tIEMPO_REAL_TRABAJO, Integer cOSTO_REAL, Date fECHA_FIN,
			Cliente rUT_CLIENTE, Decorador rUT_DECORADOR, Integer activo) {
		super();
		this.id = id;
		this.TIPO_PROYECTO_ID = tIPO_PROYECTO_ID;
		this.FECHA_INICIO = fECHA_INICIO;
		this.TIEMPO_ESTIMADO = tIEMPO_ESTIMADO;
		this.COSTO_ESTIMADO = cOSTO_ESTIMADO;
		this.TIEMPO_REAL_TRABAJO = tIEMPO_REAL_TRABAJO;
		this.COSTO_REAL = cOSTO_REAL;
		this.FECHA_FIN = fECHA_FIN;
		this.RUT_CLIENTE = rUT_CLIENTE;
		this.RUT_DECORADOR = rUT_DECORADOR;
		this.activo=activo;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoProyecto getTIPO_PROYECTO_ID() {
		return TIPO_PROYECTO_ID;
	}

	public void setTIPO_PROYECTO_ID(TipoProyecto tIPO_PROYECTO_ID) {
		TIPO_PROYECTO_ID = tIPO_PROYECTO_ID;
	}

	public Date getFECHA_INICIO() {
		return FECHA_INICIO;
	}

	public void setFECHA_INICIO(Date fECHA_INICIO) {
		FECHA_INICIO = fECHA_INICIO;
	}

	public Integer getTIEMPO_ESTIMADO() {
		return TIEMPO_ESTIMADO;
	}

	public void setTIEMPO_ESTIMADO(Integer tIEMPO_ESTIMADO) {
		TIEMPO_ESTIMADO = tIEMPO_ESTIMADO;
	}

	public Integer getCOSTO_ESTIMADO() {
		return COSTO_ESTIMADO;
	}

	public void setCOSTO_ESTIMADO(Integer cOSTO_ESTIMADO) {
		COSTO_ESTIMADO = cOSTO_ESTIMADO;
	}

	public Integer getTIEMPO_REAL_TRABAJO() {
		return TIEMPO_REAL_TRABAJO;
	}

	public void setTIEMPO_REAL_TRABAJO(Integer tIEMPO_REAL_TRABAJO) {
		TIEMPO_REAL_TRABAJO = tIEMPO_REAL_TRABAJO;
	}

	public Integer getCOSTO_REAL() {
		return COSTO_REAL;
	}

	public void setCOSTO_REAL(Integer cOSTO_REAL) {
		COSTO_REAL = cOSTO_REAL;
	}

	public Date getFECHA_FIN() {
		return FECHA_FIN;
	}

	public void setFECHA_FIN(Date fECHA_FIN) {
		FECHA_FIN = fECHA_FIN;
	}

	public Cliente getRUT_CLIENTE() {
		return RUT_CLIENTE;
	}

	public void setRUT_CLIENTE(Cliente rUT_CLIENTE) {
		RUT_CLIENTE = rUT_CLIENTE;
	}

	public Decorador getRUT_DECORADOR() {
		return RUT_DECORADOR;
	}

	public void setRUT_DECORADOR(Decorador rUT_DECORADOR) {
		RUT_DECORADOR = rUT_DECORADOR;
	}
	
	

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "proyecto [id=" + id + ", TIPO_PROYECTO_ID=" + TIPO_PROYECTO_ID + ", FECHA_INICIO=" + FECHA_INICIO
				+ ", TIEMPO_ESTIMADO=" + TIEMPO_ESTIMADO + ", COSTO_ESTIMADO=" + COSTO_ESTIMADO
				+ ", TIEMPO_REAL_TRABAJO=" + TIEMPO_REAL_TRABAJO + ", COSTO_REAL=" + COSTO_REAL + ", FECHA_FIN="
				+ FECHA_FIN + ", activo=" + activo + "]";
	}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
