package ubb.electivo.trabajo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ubb.electivo.proyectoFinal.entidades.proyecto;




@Entity
@Table(name = "ESTIMACION_TRABAJO", schema="TRABAJO")


public class Estimacion_trabajo {
	
	
	/*
	 * 
		TRABAJO_ID SERIAL NOT NULL,
		PROYECTO_ID SERIAL NOT NULL,
		RUT_CONTRATISTA CHARACTER VARYING(12) NOT NULL,
		COSTO_ESTIMADO INT,
		COSTO_REAL INT,
		ACTIVO INT,
		COSTO_MATERIAL INT,
	
			CONSTRAINT FK_TRABAJO FOREIGN KEY (TRABAJO_ID) REFERENCES TRABAJO.TRABAJOS(ID),
    		CONSTRAINT FK_PROYECTO FOREIGN KEY (PROYECTO_ID) REFERENCES PROYECTO.PROYECTO(ID), 
    		CONSTRAINT FK_CONTRATISTA FOREIGN KEY (RUT_CONTRATISTA) REFERENCES TRABAJO.CONTRATISTA(RUT_CONTRATISTA)

	 * */
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@ManyToOne
	private Trabajos TRABAJO_ID;
	
	@ManyToOne
	private proyecto PROYECTO_ID;
	
	
	@OneToMany
	private Contratista RUT_CONTRATISTA;

	
	@Column(name = "COSTO_ESTIMADO")
	private Integer COSTO_ESTIMADO;
	
	@Column(name = "COSTO_REAL")
	private Integer COSTO_REAL;
	
	@Column(name= "ACTIVO")
	private Integer activo;
	
	@Column(name = "COSTO_MATERIAL")
	private Integer COSTO_MATERIAL;
	
	
	
	public Estimacion_trabajo() {
		
	}

	public Estimacion_trabajo(Long id, Trabajos tRABAJO_ID, proyecto pROYECTO_ID, Contratista rUT_CONTRATISTA,
			Integer cOSTO_ESTIMADO, Integer cOSTO_REAL, Integer activo, Integer cOSTO_MATERIAL) {
		super();
		this.id = id;
		this.TRABAJO_ID = tRABAJO_ID;
		this.PROYECTO_ID = pROYECTO_ID;
		this.RUT_CONTRATISTA = rUT_CONTRATISTA;
		this.COSTO_ESTIMADO = cOSTO_ESTIMADO;
		this.COSTO_REAL = cOSTO_REAL;
		this.activo = activo;
		COSTO_MATERIAL = cOSTO_MATERIAL;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Trabajos getTRABAJO_ID() {
		return TRABAJO_ID;
	}

	public void setTRABAJO_ID(Trabajos tRABAJO_ID) {
		TRABAJO_ID = tRABAJO_ID;
	}

	public proyecto getPROYECTO_ID() {
		return PROYECTO_ID;
	}

	public void setPROYECTO_ID(proyecto pROYECTO_ID) {
		PROYECTO_ID = pROYECTO_ID;
	}

	public Contratista getRUT_CONTRATISTA() {
		return RUT_CONTRATISTA;
	}

	public void setRUT_CONTRATISTA(Contratista rUT_CONTRATISTA) {
		RUT_CONTRATISTA = rUT_CONTRATISTA;
	}

	public Integer getCOSTO_ESTIMADO() {
		return COSTO_ESTIMADO;
	}

	public void setCOSTO_ESTIMADO(Integer cOSTO_ESTIMADO) {
		COSTO_ESTIMADO = cOSTO_ESTIMADO;
	}

	public Integer getCOSTO_REAL() {
		return COSTO_REAL;
	}

	public void setCOSTO_REAL(Integer cOSTO_REAL) {
		COSTO_REAL = cOSTO_REAL;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Integer getCOSTO_MATERIAL() {
		return COSTO_MATERIAL;
	}

	public void setCOSTO_MATERIAL(Integer cOSTO_MATERIAL) {
		COSTO_MATERIAL = cOSTO_MATERIAL;
	}

	@Override
	public String toString() {
		return "Estimacion_trabajo [id=" + id + ", TRABAJO_ID=" + TRABAJO_ID + ", PROYECTO_ID=" + PROYECTO_ID
				+ ", RUT_CONTRATISTA=" + RUT_CONTRATISTA + ", COSTO_ESTIMADO=" + COSTO_ESTIMADO + ", COSTO_REAL="
				+ COSTO_REAL + ", activo=" + activo + ", COSTO_MATERIAL=" + COSTO_MATERIAL + "]";
	}

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
