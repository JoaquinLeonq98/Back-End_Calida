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
import calida.projectEcommerce.model.Domicilio;
import calida.projectEcommerce.service.DomiciliosService;

@RestController
@RequestMapping(path="/api/domicilios/") 
public class DomiciliosController {
	
	private final DomiciliosService domiService;
	@Autowired
	public DomiciliosController(DomiciliosService domiService) {
		this.domiService = domiService;
	}//DomiciliosController
	
	@GetMapping
	public List<Domicilio> getDomicilios(){
		return domiService.getDomicilios();
	}//getProductos
	
	@GetMapping (path="{prodId}")
	public Domicilio getDomicilio (@PathVariable("prodId") Long id) {
		return domiService.getDomicilio(id);
	}//getDomicilio
	
	@DeleteMapping (path="{prodId}")
	public void deleteDomicilio(@PathVariable("prodId") Long id) {
		domiService.deleteDomicilio(id);
	}//deleteDomicilio
	
	@PostMapping
	public Domicilio addDomicilio(@RequestBody Domicilio domicilio) {
		return domiService.addDomicilio(domicilio);
	}//addDomicilio
	
	
	
	
}//class DomicilioController
