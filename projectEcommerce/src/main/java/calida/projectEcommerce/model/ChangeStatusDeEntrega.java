package calida.projectEcommerce.model;

import java.sql.Date;

public class ChangeStatusDeEntrega {
	private Date fecha;
	private Boolean status_entrega;
	public ChangeStatusDeEntrega(Date fecha, Boolean status_entrega) {
		super();
		this.fecha = fecha;
		this.status_entrega = status_entrega;
	}//constructor
	
//----------------------------------------------------------------------
	public ChangeStatusDeEntrega(){}

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

	
	
//---------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "ChangeStatusDeEntrega [fecha=" + fecha + ", status_entrega=" + status_entrega + "]";
	}
	
	
}//class StatusDeEntrega
