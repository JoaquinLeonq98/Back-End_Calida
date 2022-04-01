package calida.projectEcommerce.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import calida.projectEcommerce.model.Producto;
import calida.projectEcommerce.service.ProductoService;

@RestController
@RequestMapping(path="/api/productos/") 
public class ProductosController {
	
	private final ProductoService productoService;
	@Autowired
	public ProductosController(ProductoService prodService) {
		this.productoService = prodService;
	}//Constructor ProductosController
	 
	@GetMapping
	public List<Producto> getProductos(){
		return productoService.getProductos();
	}//getProductos
	
	@GetMapping (path="{prodId}")
	public Producto getProducto (@PathVariable("prodId") Long id) {
		return productoService.getProducto(id);
	}//getProducto
	
	@DeleteMapping (path="{prodId}")
	public Producto deleteProducto(@PathVariable("prodId") Long id) {
		return productoService.deleteProducto(id);
	}//deleteProducto
	
	@PostMapping
	public Producto addProducto(@RequestBody Producto producto) {
	return productoService.addProducto(producto);
	}//addProducto
	
}//class ProductosController
