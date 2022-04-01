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
	private String contrase�a;
	
	public Login(Long id, String correo, String contrase�a) {
		this.id = id;
		this.correo = correo;
		this.contrase�a = contrase�a;
	}//constructor Login
	
	public Login() {
		}//constructor vac�o para add

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public Long getId() {
		return id;
	}
	//getters and setters

	@Override
	public String toString() {
		return "Login [id=" + id + ", correo=" + correo + ", contrase�a=" + contrase�a + "]";
	}//toString
	
	
	
	
	
}//class Login
