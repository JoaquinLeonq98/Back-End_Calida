package calida.backend.Proyecto_Calida.productos;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/api/productos/")
public class ProductosController {

	private final ProductosService productosService;
	public ProductosController(ProductosService productosService) {
		this.productosService = productosService;
	}//constructor para instanciar
	
	@GetMapping
	public ArrayList<Producto> getProductos(){
		
		
		 return lista;
	}//getProductos

} // Class ProductosController
