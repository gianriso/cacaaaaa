package ubb.electivo.trabajo.entidades;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;







@Entity
@Table(name = "MATERIAL", schema="TRABAJO")

public class Materiales {

	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="DESCRIPCION")
	private String DESCRIPCION;
	
	
	@Column(name = "VALOR_UNIDAD")
	private Integer CANTIDAD_METROS;
	

	@Column(name= "ACTIVO")
	private Integer activo;
	
	
	public Materiales() {
		
	}


	public Materiales(Long id, String dESCRIPCION, Integer cANTIDAD_METROS, Integer activo) {
		super();
		this.id = id;
		this.DESCRIPCION = dESCRIPCION;
		this.CANTIDAD_METROS = cANTIDAD_METROS;
		this.activo = activo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDESCRIPCION() {
		return DESCRIPCION;
	}


	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}


	public Integer getCANTIDAD_METROS() {
		return CANTIDAD_METROS;
	}


	public void setCANTIDAD_METROS(Integer cANTIDAD_METROS) {
		CANTIDAD_METROS = cANTIDAD_METROS;
	}


	public Integer getActivo() {
		return activo;
	}


	public void setActivo(Integer activo) {
		this.activo = activo;
	}


	@Override
	public String toString() {
		return "Materiales [id=" + id + ", DESCRIPCION=" + DESCRIPCION + ", CANTIDAD_METROS=" + CANTIDAD_METROS
				+ ", activo=" + activo + "]";
	}

	
	
	
	
	
	
	
}
