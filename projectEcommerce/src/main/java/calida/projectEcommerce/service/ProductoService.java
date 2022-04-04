package calida.projectEcommerce.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductoService {
	
	private final ProductosRepository productosRepository;
	
	@Autowired
	public ProductoService(ProductosRepository productosRepository) {
		super();
		this.productosRepository = productosRepository;
	}//constructor ProductoService - Instanciar solo una vez

	public List<Producto> getProductos(){
		return productosRepository.findAll();	
	}//getProductos - para encontrar todos
	
	public Producto getProducto(Long id) {
		return productosRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("El producto con el id: "+id+" no existe.")	);
	}//getProducto - para encontrar solo uno, en caso de no encontrarlo enviar mensaje

	public Producto deleteProducto(Long id) {
		Producto productoTemporal = null;
		if(productosRepository.existsById(id)) {
			productoTemporal = productosRepository.findById(id).get();
			productosRepository.deleteById(id);
		}//if si exite lo borra
		return productoTemporal;
	}//deleteProducto

	public Producto addProducto(Producto producto) {
		Producto productoTemporal = null;
		Optional<Producto> prodByName=productosRepository.findByNombre(producto.getNombre());
		if(prodByName.isPresent()) {
			throw new IllegalStateException("El producto con el nombre: " 
											+ producto.getNombre() + ", ya existe."); 	 	
		} else {
			productosRepository.save(producto);
			productoTemporal = producto;
		}//else 
		return productoTemporal;
	}//addProducto

	public Producto updateProducto(Long id, String nombre, String descripcion, String imagen, Double precio) {
		Producto productoTemporal = null;
		if(productosRepository.existsById(id)) {
			productoTemporal = productosRepository.findById(id).get();
			if (nombre!=null) productoTemporal.setNombre(nombre);
			if (descripcion!=null) productoTemporal.setDescripcion(descripcion);
			if (imagen!=null) productoTemporal.setImagen(imagen);
			if (precio!=null && precio.doubleValue()>0)  productoTemporal.setPrecio(precio);
			productosRepository.save(productoTemporal);
		}//if si exite lo trae y los if (segundo anidado) los agregan
		else {
			System.out.println("No exite el producto con el id: " +id);
		}//Else
		return productoTemporal;
	}//updateProducto
	
	

}//class ProductoService
