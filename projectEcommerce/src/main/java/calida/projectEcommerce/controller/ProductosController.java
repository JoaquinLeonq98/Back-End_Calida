package calida.projectEcommerce.controller;
import java.util.ArrayList;
import java.util.List;
import calida.projectEcommerce.model.Producto;
import calida.projectEcommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping (path="/api/productos/")
@CrossOrigin(origins="*")//acceder 
public class ProductosController {
	private final ProductosService productosService;
	@Autowired
	public ProductosController(ProductosService productosService) {
		this.productosService = productosService;
	}//constructor para instanciar solo una vez al iniciar el servidor
		
		@GetMapping
		public ArrayList<Producto> getProductos(){
			 return productosService.getProductos();
		}//getProductos
		
		@GetMapping(path="{productoID}")
		public Producto getProducto(@PathVariable("productoID") Long productoID) {
			return productosService.getProducto(productoID);
		}//getProducto
		
		@DeleteMapping(path="{productoID}")
		public Producto deleteProducto(@PathVariable("productoID") Long productoID){
			return productosService.deleteProducto(productoID);
		}//deleteProducto
		
		@PostMapping
		public Producto addProducto(@RequestBody Producto producto) {
			return productosService.addProducto(producto);
		}//addProducto
		
		@PutMapping(path="{productoID}")
		public Producto updateProducto(@PathVariable("productoID") Long productoID, 
			@RequestParam (required=false) String nombre, 
			@RequestParam (required=false) String descripcion, 
			@RequestParam (required=false) String URL_imagen, 
			@RequestParam (required=false) double precio, 
			@RequestParam (required=false) int inventario ) {
			return productosService.updateProducto(productoID,nombre,descripcion,URL_imagen, precio,inventario);
		}//updateProducto


}//class ProductosController
