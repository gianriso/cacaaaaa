package ubb.electivo.persona.entidades;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "REGION", schema = "PERSONA")

public class Region {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOMBRE")
	private String nombreRegion;
	@Column(name = "ACTIVO")
	private Integer activo;
	
	public Region() {
		
	}
	
	
	

	public Region(Long id, String nombreRegion, Integer activo) {
		super();
		this.id = id;
		this.nombreRegion = nombreRegion;
		this.activo = activo;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", nombreRegion=" + nombreRegion + ", activo=" + activo + "]";
	}
	
	
	

}
