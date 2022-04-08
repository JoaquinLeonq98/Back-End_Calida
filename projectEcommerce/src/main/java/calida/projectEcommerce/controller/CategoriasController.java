/*packages and imports*/
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
import calida.projectEcommerce.model.Categoria;
import calida.projectEcommerce.service.CategoriasService;

@RestController
@RequestMapping(path="/api/categorias/")
public class CategoriasController {
	
	private final CategoriasService categoriasService;
	@Autowired
	public CategoriasController(CategoriasService categoriasService) {
		super();
		this.categoriasService = categoriasService;
	}//constructor CategoriasController
	
//metodos
		@GetMapping
		public List<Categoria> getCategorias(){
			return categoriasService.getCategorias();
		}//getCategorias - trae todos los usuarios
			
		@GetMapping (path="{prodId}")
		public Categoria getCategoria (@PathVariable("prodId") Long id) {
			return categoriasService.getCategoria(id);
		}//getCategoria - trae solo un usuario
			
		@DeleteMapping (path="{prodId}")
		public void deleteCategoria (@PathVariable("prodId") Long id) {
			categoriasService.deleteCategoria(id);
		}//deleteCategoria
			
		@PostMapping
		public Categoria addCategoria(@RequestBody Categoria categoria) {
			return categoriasService.addCategoria(categoria);
		}//addCategoria
	
}//class CategoriasController
