package calida.projectEcommerce.model;

public class CambiarContrasena {
	private String correo;
	private String contrasena;
	private String nuevaContrasena;
	
	public CambiarContrasena(String correo, String contrasena, String nuevaContrasena) {
		super();
		this.correo = correo;
		this.contrasena = contrasena;
		this.nuevaContrasena = nuevaContrasena;
	}//constructor
	
	public CambiarContrasena() {
		}//constructor vacío

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNuevaContrasena() {
		return nuevaContrasena;
	}
	public void setNuevaContrasena(String nuevaContrasena) {
		this.nuevaContrasena = nuevaContrasena;
	}
	//getters and setters

	@Override
	public String toString() {
		return "CambiarContrasena [correo=" + correo + ", contrasena=" + contrasena + ", nuevaContrasena="
				+ nuevaContrasena + "]";
	}//toString
	
	
	
}//class cambiar Contrasena

