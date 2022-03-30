package calida.backend.Proyecto_Calida.productos;

public class Producto {
	private String nombre;
	private double precio;
	private String descripcion;
	private String imagen; // TODO definir tipo de variable
	private int inventario;
	private long id;
	private static long total = 0;
	public Producto(String nombre, double precio, String descripcion, String imagen, int inventario) { 
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.inventario = inventario;
		total ++;
		this.id = total;
	} // CONSTRUCTOR
	
	public Producto() {
		total ++;
		this.id=total;
	} // CONSTRUCTOR VACIO
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public int getInventario() {
		return inventario;
	}
	public void setInventario(int inventario) {
		this.inventario = inventario;
	}
	public long getId() {
		return id;
	} // getters & setters


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", imagen="
				+ imagen + ", inventario=" + inventario + ", id=" + id + "]";
	} //toString()
	
	
	
	
	
	

}// clase producto
