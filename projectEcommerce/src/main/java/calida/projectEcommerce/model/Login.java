package calida.projectEcommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcliente", unique=true, nullable=false)
	private Long id;
	private String correo;
	private String contraseña;
	
	public Login(Long id, String correo, String contraseña) {
		this.id = id;
		this.correo = correo;
		this.contraseña = contraseña;
	}//constructor Login
	
	public Login() {
		}//constructor vacío para add

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Long getId() {
		return id;
	}
	//getters and setters

	@Override
	public String toString() {
		return "Login [id=" + id + ", correo=" + correo + ", contraseña=" + contraseña + "]";
	}//toString
	
	
	
	
	
}//class Login
