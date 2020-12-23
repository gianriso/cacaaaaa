package ubb.electivo.proyectoFinal.entidades;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "TIPO_PROYECTO", schema="PROYECTO")


public class TipoProyecto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "DESCRIPCION")
	private String nombre_ciudad;
	
	@Column(name = "activo")
	private Integer activo;
	
	public TipoProyecto() {
		
	}

	public TipoProyecto(Long id, String nombre_ciudad, Integer activo) {
		super();
		this.id = id;
		this.nombre_ciudad = nombre_ciudad;
		this.activo = activo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "TipoProyecto [id=" + id + ", nombre_ciudad=" + nombre_ciudad + ", activo=" + activo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
