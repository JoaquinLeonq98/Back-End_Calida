package calida.projectEcommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproducto", unique=true, nullable=false)//nombre del id en la tabla mysql
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_imagen; 
	private double precio;
	private int inventario;
	
	public Producto(Long id, String nombre, String descripcion, String uRL_imagen, double precio, int inventario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.precio = precio;
		this.inventario = inventario;
	}//Constructor Producto
	
	public Producto() {
	}//ConstructorProducto vacio para add

	public Long getId() {
		return id;
	}//getId
	//public void setId(Long id) {
	//	this.id = id;
	//}//setId

	//Inicio Getters y Setters
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getDescripcion() {
		return descripcion;
	}//getDescripcion
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion

	public String getURL_imagen() {
		return URL_imagen;
	}//getURL_imagen
	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}//setURL_imagen

	public double getPrecio() {
		return precio;
	}//getPrecio
	public void setPrecio(double precio) {
		this.precio = precio;
	}//setPrecio

	public int getInventario() {
		return inventario;
	}//getInventario
	public void setInventario(int inventario) {
		this.inventario = inventario;
	}//setInventario

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen="
				+ URL_imagen + ", precio=" + precio + ", inventario=" + inventario + "]";
	}//toString
	
	


	
}//class Producto
