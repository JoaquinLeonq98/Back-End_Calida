package calida.projectEcommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedido_has_producto")

public class PedidoHasProducto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idpedido_has_producto", unique=true, nullable=false)
	private Long id;
	private int cantidad;
	private double importe;
	private double total;
	
	public PedidoHasProducto(Long id, int cantidad, double importe, double total) {
		this.id = id;
		this.cantidad = cantidad;
		this.importe = importe;
		this.total = total;
	}//Constructor
	
	public PedidoHasProducto() {
		}//Constructor vacío
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	//Getters and Setters

	@Override
	public String toString() {
		return "PedidoHasProducto [id=" + id + ", cantidad=" + cantidad + ", importe=" + importe + ", total=" + total
				+ "]";
	}
	//toString
	
	
	
}//class PedidoHasProducto
