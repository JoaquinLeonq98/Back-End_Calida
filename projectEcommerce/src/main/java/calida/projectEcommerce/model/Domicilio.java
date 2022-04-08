/*packages and imports*/
package calida.projectEcommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domicilio_envio")
public class Domicilio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //
	@Column(name="id", unique=true, nullable=false)  
	private long id;
	private String estado;
	private String cp;
	private String calle;
	private String colonia;
	private String numero_int;
	private String alcaldia;
	private String numero_ext;
	
	public Domicilio(long id, String estado, String cp, String calle, String colonia, String numero_int,
			String alcaldia, String numero_ext) {
		super();
		this.id = id;
		this.estado = estado;
		this.cp = cp;
		this.calle = calle;
		this.colonia = colonia;
		this.numero_int = numero_int;
		this.alcaldia = alcaldia;
		this.numero_ext = numero_ext;
	}//constructor Domicilio con todos los parametros

	public Domicilio() {
		super();
	}//constructor Domicilio vacio para add
	
	public long getId() {
		return id;
	}//getId

	public String getEstado() {
		return estado;
	}//getEstado
	public void setEstado(String estado) {
		this.estado = estado;
	}//setEstado

	public String getCp() {
		return cp;
	}//getCp
	public void setCp(String cp) {
		this.cp = cp;
	}//setCp

	public String getCalle() {
		return calle;
	}//getCalle
	public void setCalle(String calle) {
		this.calle = calle;
	}//setCalle

	public String getColonia() {
		return colonia;
	}//getColonia
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}//setColonia

	public String getNumero_int() {
		return numero_int;
	}//getNumero_int
	public void setNumero_int(String numero_int) {
		this.numero_int = numero_int;
	}//setNumero_int

	public String getAlcaldia() {
		return alcaldia;
	}//getAlcaldia
	public void setAlcaldia(String alcaldia) {
		this.alcaldia = alcaldia;
	}//setAlcaldia

	public String getNumero_ext() {
		return numero_ext;
	}//getNumero_ext
	public void setNumero_ext(String numero_ext) {
		this.numero_ext = numero_ext;
	}//setNumero_ext

	@Override
	public String toString() {
		return "Domicilio [id=" + id + ", estado=" + estado + ", cp=" + cp + ", calle=" + calle + ", colonia=" + colonia
				+ ", numero_int=" + numero_int + ", alcaldia=" + alcaldia + ", numero_ext=" + numero_ext + "]";
	}//toString
	
}//class Domicilio
