package calida.projectEcommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reseña")
public class resenia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idreseña", unique=true, nullable=false)
	private Long id;
	private double calificacion;
	private String comentario;
	private Date fecha;
	private int producto;
	
	public resenia(Long id, double calificacion, String comentario, Date fecha, int producto) {
		this.id = id;
		this.calificacion = calificacion;
		this.comentario = comentario;
		this.fecha = fecha;
		this.producto = producto;
	}//constructorResenia

	public resenia() {
	}//constructorVacio

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getProducto() {
		return producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

	public Long getId() {
		return id;
	}//gettersAndSetters

	@Override
	public String toString() {
		return "reseña [id=" + id + ", calificacion=" + calificacion + ", comentario=" + comentario + ", fecha=" + fecha
				+ ", producto=" + producto + "]";
	}//toString
	
	
}//classresenia
