package calida.projectEcommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="metodo_pago")
public class Metodo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	private String pago;
	
	public Metodo(Long id, String pago) {
		this.id = id;
		this.pago = pago;
	}//Constructor Metodo
	
	public Metodo() {
		}//Constructor vacío

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPago() {
		return pago;
	}
	public void setPago(String pago) {
		this.pago = pago;
	}
	//getters and setters

	@Override
	public String toString() {
		return "Metodo [id=" + id + ", pago=" + pago + "]";
	}//toString
	
	
	
	
	
}//class Metodo
