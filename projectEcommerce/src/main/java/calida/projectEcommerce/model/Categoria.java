/*packages and imports*/
package calida.projectEcommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id", unique=true, nullable=false)
	private long id;
	private String nombre;
	
	public Categoria(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}//constructor Categoria con todos los parametros

	public Categoria() {
		super();
	}//constructor Categoria vacio para add

	public long getId() {
		return id;
	}//getId
	
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}//toString

}//class Categoria
