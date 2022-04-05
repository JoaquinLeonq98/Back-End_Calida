package calida.projectEcommerce.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.Mensaje;

@Service
public class MensajesService {
	private final MensajesRepository mensajesRepository;
	
	@Autowired
	public MensajesService(MensajesRepository mensajesRepository) {
		this.mensajesRepository = mensajesRepository;
	}//constructor MensajesService

	public List<Mensaje> getMensajes() {
		return mensajesRepository.findAll();
	}//getMensajes - todos

	public Mensaje getMensaje(Long id) {
		return mensajesRepository.findById(id).orElseThrow(
				()-> new IllegalStateException(
			"El mensaje con el id: "+id+" no existe.")	);
	}//getMensaje - Solo uno

	public void deleteMensaje(Long id) {
		if(	mensajesRepository.existsById(id)) {
			mensajesRepository.deleteById(id);
		}//if si exite lo borra
	}//deleteMensaje

	public Mensaje addMensaje(Mensaje mensaje) {
		Mensaje mensajeTemporal = null;
		Optional<Mensaje> mensajeByName=mensajesRepository.findByCorreo(mensaje.getCorreo());
		if(mensajeByName.isPresent()) {
			throw new IllegalStateException("El producto con el nombre: " 
											+ mensaje.getCorreo() + ", ya existe."); 	 	
		} else {
			mensajesRepository.save(mensaje);
			mensajeTemporal = mensaje;
		}//else 
		return mensajeTemporal;
	}//addMensaje
	
}//class MensajesService
