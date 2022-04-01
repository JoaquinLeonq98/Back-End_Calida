package calida.projectEcommerce.service;
import java.util.List;
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
	
	

}//class ProductoService
