package calida.backend.Proyecto_Calida.productos;

public class Producto {
	private String nombre;
	private String descripcion;
	private String url_imagen; // TODO definir tipo de variable
	private double precio;
	private int inventario;
	private int id;
	private static int total = 0;
	
	//Inicio constructor Producto
	public Producto(String descripcion, String url_imagen, String nombre, double precio, int inventario) {
		super();
		this.descripcion = descripcion;
		this.url_imagen = url_imagen;
		this.nombre = nombre;
		total++;
		this.id = total;
		
		this.precio = precio;
		this.inventario = inventario;
	}//constructor producto

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

	public String getUrl_imagen() {
		return url_imagen;
	}//getUrl_imagen
	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}//setUrl_imagen

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

	public int getId() {
		return id;
	}//getId
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", url_imagen=" + url_imagen
				+ ", precio=" + precio + ", inventario=" + inventario + ", id=" + id + "]";
	}//toString()
	
	
	
	
	

}//class Producto
