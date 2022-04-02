package calida.projectEcommerce.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpediddo", unique=true, nullable=false)
	private Long id;
	private Date fecha;
	private Boolean status_entrega;
	private Boolean status_pago;
	
//====================================================================================//
	
	public Pedido(Long id, Date fecha, Boolean status_entrega, Boolean status_pago) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.status_entrega = status_entrega;
		this.status_pago = status_pago;
	}//constructor
	
	
	public Pedido() {
		
	}//constructorVacio 

//=========================================================================================
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Boolean getStatus_entrega() {
		return status_entrega;
	}


	public void setStatus_entrega(Boolean status_entrega) {
		this.status_entrega = status_entrega;
	}


	public Boolean getStatus_pago() {
		return status_pago;
	}


	public void setStatus_pago(Boolean status_pago) {
		this.status_pago = status_pago;
	}
	// Gets && Sets================================================================


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha=" + fecha + ", status_entrega=" + status_entrega + ", status_pago="
				+ status_pago + "]";
	}//ToString
	
	
}//classPedido
