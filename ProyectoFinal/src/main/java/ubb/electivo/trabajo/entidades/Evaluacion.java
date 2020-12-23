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

import ubb.electivo.persona.entidades.Cliente;
import ubb.electivo.proyectoFinal.entidades.proyecto;


@Entity
@Table(name = "EVALUACION", schema="TRABAJO")




public class Evaluacion {

	
	/*	
	ID SERIAL NOT NULL,
	PROYECTO_ID SERIAL NOT NULL,
	RUT_CLIENTE CHARACTER VARYING(12) NOT NULL,
	CALIFICACION CHARACTER VARYING(255) NOT NULL,
	OBSERVACION CHARACTER VARYING(255) NOT NULL,
	ACTIVO INT,
    CONSTRAINT PK_EVALUACION PRIMARY KEY (ID),
    CONSTRAINT FK_PROYECTO FOREIGN KEY (PROYECTO_ID) REFERENCES PROYECTO.PROYECTO(ID), 
    CONSTRAINT FK_CLIENTE FOREIGN KEY (RUT_CLIENTE) REFERENCES PERSONA.CLIENTE(RUT_CLIENTE)
    
    */
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	private proyecto PROYECTO_ID;
	
	@OneToMany
	private Cliente RUT_CLIENTE;
	
	@Column(name="CALIFICACION")
	private String CALIFICACION;
	
	
	@Column(name="OBSERVACION")
	private String OBSERVACION;
	
	
	@Column(name= "ACTIVO")
	private Integer activo;
	
	
	
	
	public Evaluacion() {
		
	}


	public Evaluacion(Long id, proyecto pROYECTO_ID, Cliente rUT_CLIENTE, String cALIFICACION, String oBSERVACION,
			Integer activo) {
		super();
		this.id = id;
		this.PROYECTO_ID = pROYECTO_ID;
		this.RUT_CLIENTE = rUT_CLIENTE;
		this.CALIFICACION = cALIFICACION;
		this.OBSERVACION = oBSERVACION;
		this.activo = activo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public proyecto getPROYECTO_ID() {
		return PROYECTO_ID;
	}


	public void setPROYECTO_ID(proyecto pROYECTO_ID) {
		PROYECTO_ID = pROYECTO_ID;
	}


	public Cliente getRUT_CLIENTE() {
		return RUT_CLIENTE;
	}


	public void setRUT_CLIENTE(Cliente rUT_CLIENTE) {
		RUT_CLIENTE = rUT_CLIENTE;
	}


	public String getCALIFICACION() {
		return CALIFICACION;
	}


	public void setCALIFICACION(String cALIFICACION) {
		CALIFICACION = cALIFICACION;
	}


	public String getOBSERVACION() {
		return OBSERVACION;
	}


	public void setOBSERVACION(String oBSERVACION) {
		OBSERVACION = oBSERVACION;
	}


	public Integer getActivo() {
		return activo;
	}


	public void setActivo(Integer activo) {
		this.activo = activo;
	}


	@Override
	public String toString() {
		return "Evaluacion [id=" + id + ", PROYECTO_ID=" + PROYECTO_ID + ", CALIFICACION=" + CALIFICACION
				+ ", OBSERVACION=" + OBSERVACION + ", activo=" + activo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
