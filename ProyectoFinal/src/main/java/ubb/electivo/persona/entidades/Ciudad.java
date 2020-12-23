package ubb.electivo.persona.entidades;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CIUDAD", schema = "PERSONA")

public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOMBRE")
	private String nombreCiudad;
	@Column(name = "ACTIVO")
	private Integer ACTIVO;
	
	@ManyToOne
	private Region REGION_ID;
	
	
	public Ciudad() {
		
	}

	

	public Ciudad(Long id, String nombreCiudad, Integer aCTIVO, Region rEGION_ID) {
		super();
		this.id = id;
		this.nombreCiudad = nombreCiudad;
		this.ACTIVO = aCTIVO;
		this.REGION_ID = rEGION_ID;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombreCiudad() {
		return nombreCiudad;
	}


	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}


	public Integer getACTIVO() {
		return ACTIVO;
	}


	public void setACTIVO(Integer aCTIVO) {
		ACTIVO = aCTIVO;
	}


	public Region getREGION_ID() {
		return REGION_ID;
	}


	public void setREGION_ID(Region rEGION_ID) {
		REGION_ID = rEGION_ID;
	}


	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombreCiudad=" + nombreCiudad + ", ACTIVO=" + ACTIVO + "]";
	}	
	
	
	
	
	
	
	
}
