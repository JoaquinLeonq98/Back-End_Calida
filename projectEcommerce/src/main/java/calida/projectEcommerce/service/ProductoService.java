package calida.projectEcommerce.service;
import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.Producto;

import java.util.ArrayList;

@Service
public class ProductoService {
	public final ArrayList<Producto> lista = new ArrayList<Producto>();
	public ProductosService() {
		lista.add(
			new Producto(
				"Tamaño CH, de riego 1 vez a la semana, luz tipo resolana y semisombra.",
				 "Aglaonema roja.jpg",
				 "aglaonema roja",
				 151.00,
				10)		);
		lista.add(
			new Producto(
				"Tamaño CH, de riego 1 vez a la semana, luz tipo resolana, semisombra y luz artificia.",
				 "Aglaonema rosa.jpg",
				 "aglaonema rosa",
				 151.00,
				10)		);
		lista.add(
			new Producto(
				"Tamaño CH, de riego 1 o 2 veces por semana, luz tipo resolana, semisombra y soporta sol directo en pequeñas cantidades.",
				 "Amoena.JPG",
				 "amoena / amoena hoja reina",
				 79.00,
				10)		);
	}//constructor
	
	public ArrayList<Producto> getProductos() {
		return lista;
	}//getProductos

	public Producto getProducto(Long productoID) {
		Producto tmpProducto = null;
		for (Producto producto : lista) {
			if (producto.getId()==productoID) {
				tmpProducto = producto;
				break;
			}//If para buscar los productos, cuando lo encuentra lo asigna a la varibla temporal y termina
		}//foreach
		return tmpProducto;
	}//getProducto

	public Producto deleteProducto(Long productoID) {
		Producto tmpProducto = null;
		for (Producto producto : lista) {
			if (producto.getId()==productoID) {
				tmpProducto = lista.remove(lista.indexOf(producto));
				break;
			}//If para buscar los productos y borrarlos
		}//foreach
		return tmpProducto;
	}//deleteProducto

	public Producto addProducto(Producto producto) {
		lista.add(producto);
		return producto;
	}//addProducto

	public Producto updateProducto(
			Long productoID, String nombre, String descripcion, 
			String url_imagen, double precio, int inventario) {
		Producto tmpProducto = null;
		for (Producto producto : lista) {
			if (producto.getId()==productoID) {
				if (nombre!=null)producto.setNombre(nombre);
				if (descripcion!=null)producto.setDescripcion(descripcion);
				if (url_imagen!=null)producto.setURL_imagen(url_imagen);
				if (precio>0)producto.setPrecio(precio);
				if (inventario!=null)producto.setInventario(inventario);
				tmpProducto = producto;
				break;
				}//If getId
		}//foreach
		return tmpProducto;
	}//updateProducto
	
	

}//class ProductoService
