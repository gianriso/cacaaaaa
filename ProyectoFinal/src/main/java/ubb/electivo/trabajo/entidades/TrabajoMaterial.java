package ubb.electivo.trabajo.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;








@Entity
@Table(name = "TRABAJO_MATERIAL", schema="TRABAJO")



public class TrabajoMaterial {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	private Trabajos TRABAJO_ID;
	
	@ManyToOne
	private Materiales MATERIAL_ID;
	
	@Column(name = "COSTO_MATERIAL")
	private Integer COSTO_MATERIAL;
	

	@Column(name= "ACTIVO")
	private Integer activo;


	public TrabajoMaterial(Long id, Trabajos tRABAJO_ID, Materiales mATERIAL_ID, Integer cOSTO_MATERIAL,
			Integer activo) {
		super();
		this.id = id;
		this.TRABAJO_ID = tRABAJO_ID;
		this.MATERIAL_ID = mATERIAL_ID;
		this.COSTO_MATERIAL = cOSTO_MATERIAL;
		this.activo = activo;
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


	public Materiales getMATERIAL_ID() {
		return MATERIAL_ID;
	}


	public void setMATERIAL_ID(Materiales mATERIAL_ID) {
		MATERIAL_ID = mATERIAL_ID;
	}


	public Integer getCOSTO_MATERIAL() {
		return COSTO_MATERIAL;
	}


	public void setCOSTO_MATERIAL(Integer cOSTO_MATERIAL) {
		COSTO_MATERIAL = cOSTO_MATERIAL;
	}


	public Integer getActivo() {
		return activo;
	}


	public void setActivo(Integer activo) {
		this.activo = activo;
	}


	@Override
	public String toString() {
		return "TrabajoMaterial [id=" + id + ", TRABAJO_ID=" + TRABAJO_ID + ", MATERIAL_ID=" + MATERIAL_ID
				+ ", COSTO_MATERIAL=" + COSTO_MATERIAL + ", activo=" + activo + "]";
	}
	
	
	
	
	
	
	
	
}
