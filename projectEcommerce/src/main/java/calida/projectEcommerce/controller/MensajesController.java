package calida.projectEcommerce.controller;
import calida.projectEcommerce.model.Mensaje;
import calida.projectEcommerce.service.MensajesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/mensajes/")
public class MensajesController {
	
	private final MensajesService mensajesService;
	@Autowired
	public MensajesController(MensajesService mensajesService) {
		super();
		this.mensajesService = mensajesService;
	}//constructor MensajesService
	
	//metodos
		@GetMapping
		public List<Mensaje> getMensajes(){
			return mensajesService.getMensajes();
		}//getUsuarios - trae todos los usuarios
		
		@GetMapping (path="{prodId}")
		public Mensaje getMensaje (@PathVariable("prodId") Long id) {
			return mensajesService.getMensaje(id);
		}//getUsuario - trae solo un usuario
		
		@DeleteMapping (path="{prodId}")
		public void deleteMensaje(@PathVariable("prodId") Long id) {
			mensajesService.deleteMensaje(id);
		}//deleteMensaje
		/*
		@PostMapping
		public void addMensaje(@RequestBody Mensaje mensaje) {
			mensajesService.addMensaje(mensaje);
		}//addMensaje
		*/
}//class MensajesController
