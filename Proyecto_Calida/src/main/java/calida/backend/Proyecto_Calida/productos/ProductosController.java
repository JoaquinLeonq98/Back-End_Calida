package calida.backend.Proyecto_Calida.productos;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/productos/")
@CrossOrigin(origins="*")

public class ProductosController {
	private final ProductosService productosServices;
	
	@Autowired
	public ProductosController(ProductosService productosService) {
		this.productosServices = productosService;
		
	} // CONSTRUCTOR
	
	@GetMapping
	public ArrayList <Producto> getProductos(){
		return productosService.getProductos(); 
		
	} // esto es getProductos

} // Class ProductosController
