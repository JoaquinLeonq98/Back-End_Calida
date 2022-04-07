package calida.projectEcommerce.model;

public class ChangeProducto {
	
	private String nombre;
	private String descripcion;
	private String imagen; 
	private Double precio;
	private int inventario;
	private String newNombre;
	private String newDescripcion;
	private String newImagen; 
	private Double newPrecio;
	private int newInventario;
	
	public ChangeProducto(String nombre, String descripcion, String imagen, Double precio, int inventario,
			String newNombre, String newDescripcion, String newImagen, Double newPrecio, int newInventario) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.inventario = inventario;
		this.newNombre = newNombre;
		this.newDescripcion = newDescripcion;
		this.newImagen = newImagen;
		this.newPrecio = newPrecio;
		this.newInventario = newInventario;
	}//Constructor ChangeProducto

	public ChangeProducto() {
		super();
	}//ChangeProducto vacio para add

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

	public String getImagen() {
		return imagen;
	}//getImagen
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}//setImagen

	public Double getPrecio() {
		return precio;
	}//getPrecio
	public void setPrecio(Double precio) {
		this.precio = precio;
	}//setPrecio

	public int getInventario() {
		return inventario;
	}//getInventario
	public void setInventario(int inventario) {
		this.inventario = inventario;
	}//setInventario

	public String getNewNombre() {
		return newNombre;
	}//getNewNombre
	public void setNewNombre(String newNombre) {
		this.newNombre = newNombre;
	}//setNewNombre

	public String getNewDescripcion() {
		return newDescripcion;
	}//getNewDescripcion
	public void setNewDescripcion(String newDescripcion) {
		this.newDescripcion = newDescripcion;
	}//setNewDescripcion

	public String getNewImagen() {
		return newImagen;
	}//getNewImagen
	public void setNewImagen(String newImagen) {
		this.newImagen = newImagen;
	}//setNewImagen

	public Double getNewPrecio() {
		return newPrecio;
	}//getNewPrecio
	public void setNewPrecio(Double newPrecio) {
		this.newPrecio = newPrecio;
	}//setNewPrecio

	public int getNewInventario() {
		return newInventario;
	}//getNewInventario
	public void setNewInventario(int newInventario) {
		this.newInventario = newInventario;
	}//setNewInventario

	@Override
	public String toString() {
		return "ChangeProducto [nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", precio="
				+ precio + ", inventario=" + inventario + ", newNombre=" + newNombre + ", newDescripcion="
				+ newDescripcion + ", newImagen=" + newImagen + ", newPrecio=" + newPrecio + ", newInventario="
				+ newInventario + "]";
	}//toString
	

}//class ChangeProducto
