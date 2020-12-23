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
@Table(name = "CLIENTE", schema = "PERSONA")


public class Cliente {
	@Id
	private String rut_cliente;
	
	@ManyToOne
	private Persona persona;
	
	public Cliente() {
		
	}

	public Cliente(String rut_cliente, Persona persona) {
		super();
		this.rut_cliente = rut_cliente;
		this.persona = persona;
	}

	public String getRut_cliente() {
		return rut_cliente;
	}

	public void setRut_cliente(String rut_cliente) {
		this.rut_cliente = rut_cliente;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Cliente [rut_cliente=" + rut_cliente + ", persona=" + persona + "]";
	}
	
	
	
	
	
	
	
	
}
