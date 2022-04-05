/*packages and imports*/
package calida.projectEcommerce.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.Domicilio;

@Service
public class DomiciliosService {
	private final DomiciliosRepository domiciliosRepository;
	@Autowired
	public DomiciliosService(DomiciliosRepository domiciliosRepository) {
		this.domiciliosRepository = domiciliosRepository;
	}//constructor DomiciliosService

	
	public List<Domicilio> getDomicilios() {
		return domiciliosRepository.findAll();
	}//getDomicilios
	

	public Domicilio getDomicilio(Long id) {
		return domiciliosRepository.findById(id).orElseThrow(
				()-> new IllegalStateException(
			"El domicilio con el id: "+id+", no existe.")	);
	}//getDomicilio

	public void deleteDomicilio(Long id) {
		if(	domiciliosRepository.existsById(id)) {
			domiciliosRepository.deleteById(id);
		}//if si exite lo borra
	}//deleteDomicilio

	public Domicilio addDomicilio(Domicilio domicilio) {
		Domicilio domicilioTemporal = null;
		Optional<Domicilio> domicilioByName=domiciliosRepository.findByCalle(domicilio.getCalle());
		if(domicilioByName.isPresent()) {
			throw new IllegalStateException("El producto con el nombre: " 
											+ domicilio.getCalle() + ", ya existe."); 	 	
		} else {
			domiciliosRepository.save(domicilio);
			domicilioTemporal = domicilio;
		}//else 
		return domicilioTemporal;
	}//addDomicilio

}//class DomiciliosService
