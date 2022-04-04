package calida.projectEcommerce.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import calida.projectEcommerce.model.Producto;
import calida.projectEcommerce.service.ProductoService;

@RestController
@RequestMapping(path="/api/productos/") 
public class ProductosController {
	
	private final ProductoService productoService;
	@Autowired
	public ProductosController(ProductoService productoService) {
		
		this.productoService = productoService;
	}//Constructor ProductosController
	 
	@GetMapping
	public List<Producto> getProductos(){
		return productoService.getProductos();
	}//getProductos - Todos
	
	@GetMapping (path="{prodId}")
	public Producto getProducto (@PathVariable("prodId") Long id) {
		return productoService.getProducto(id);
	}//getProducto - Solo uno
	
	@DeleteMapping (path="{prodId}")
	public Producto deleteProducto(@PathVariable("prodId") Long id) {
		return productoService.deleteProducto(id);
	}//deleteProducto
	
	@PostMapping
	public Producto addProducto(@RequestBody Producto producto) {
		return productoService.addProducto(producto);
	}//addProducto
	
	@PutMapping(path="{prodId}")
	public Producto updateProducto(
		@PathVariable("prodId") Long prodId, 
		@RequestParam (required=false) String nombre, 
		@RequestParam (required=false) String descripcion, 
		@RequestParam (required=false) String imagen, 
		@RequestParam (required=false) double precio,
		@RequestParam (required=false) int inventario) {
		return productoService.updateProducto(prodId,nombre,descripcion,imagen,precio);
	}//updateProducto
	
}//class ProductosController
