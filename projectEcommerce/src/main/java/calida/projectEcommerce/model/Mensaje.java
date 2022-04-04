package calida.projectEcommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mensaje") // nombre de la tabla en la DB
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String correo;
	private String telefono;
	private String texto;

	public Mensaje(Long id, String nombre, String correo, String telefono, String texto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.texto = texto;
	}// Constructor mensaje

	public Mensaje() {
	}// Constructor mensaje vacio para add

	public Long getId() {
		return id;
	}// getId

	public String getNombre() {
		return nombre;
	}// getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}// setNombre

	public String getCorreo() {
		return correo;
	}// getCorreo

	public void setCorreo(String correo) {
		this.correo = correo;
	}// setCorreo

	public String getTelefono() {
		return telefono;
	}// getTelefono

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}// setTelefono

	public String getTexto() {
		return texto;
	}// getTexto

	public void setTexto(String texto) {
		this.texto = texto;
	}// setTexto

	@Override
	public String toString() {
		return "mensaje [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", texto="
				+ texto + "]";
	}// toString

}// class mensaje
