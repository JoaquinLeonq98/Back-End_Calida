package calida.projectEcommerce.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.Producto;

@Service
public class ProductoService {
	
	private final ProductosRepository productosRepository;
	
	@Autowired
	public ProductoService(ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	}//constructor ProductoService

	public List<Producto> getProductos(){
		return productosRepository.findAll();	
	}//getProductos para encontrar todos
	
	public Producto getProducto(Long id) {
		return productosRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("El producto con el id: "+id+" no existe.")	);
	}//getProducto para encontrar solo uno, en caso de no encontrarlo enviar mensaje

	public Producto deleteProducto(Long id) {
		Producto tmpProducto = null;
		if(productosRepository.existsById(id)) {
			tmpProducto = productosRepository.findById(id).get();
			productosRepository.deleteById(id);
		}//if si exite lo borra
		return tmpProducto;
	}//deleteProducto

	public Producto addProducto(Producto producto) {
		Producto tmpProducto = null;
		Optional<Producto> prodByName=productosRepository.findByNombre(producto.getNombre());
		if(prodByName.isPresent()) {
			throw new IllegalStateException("El Producto con el nombre:"
					+ " " + producto.getNombre() + ", ya existe."); 	
		} else {
			productosRepository.save(producto);
			tmpProducto = producto;
		}//else 
		return tmpProducto;
	}//addProducto

	public Producto updateProducto(Long prodId, String nombre, String descripcion, String uRL_imagen, double precio) {
		Producto tmpProducto = null;
		for (Producto producto : productosRepository) {
			if (producto.getId()==prodId) {
				if (nombre!=null)producto.setNombre(nombre);
				if (descripcion!=null)producto.setDescripcion(descripcion);
				if (uRL_imagen!=null)producto.setURL_imagen(uRL_imagen);
				if(precio>0)producto.setPrecio(precio);
				tmpProducto = producto;
				break;
				}//if getId
		}//foreach
		return tmpProducto;
	}//updateProducto
	
	

}//class ProductoService
