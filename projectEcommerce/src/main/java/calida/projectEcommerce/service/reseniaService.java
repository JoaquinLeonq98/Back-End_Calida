package calida.projectEcommerce.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.resenia;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class reseniaService {
	
	private final reseniaRepository reseniaRepository;
	
	@Autowired
	public reseniaService(reseniaRepository reseniaRepository) {
		this.reseniaRepository = reseniaRepository;
	}//Constructor reseniaService
	
	public List<resenia>getresenia(){
		return reseniaRepository.findAll();
	}//getResenia-encontrarTodas
	
	public resenia getresenia(Long id) {
		return reseniaRepository.findById(id).orElseThrow(
				()->new IllegalStateException("La reseña con el id: " +id+ " no existe. ") );
	}//getResenia- para encontrarUno
	
	public resenia deleteResenia(Long id) {
		resenia reseniaTemporal = null;
		if(reseniaRepository.existsById(id)) {
			reseniaTemporal = reseniaRepository.findById(id).get();
			if (calificacion!=null) reseniaTemporal.setCalificacion(calificacion);
			if (comentario!=null) reseniaTemporal.setComentaario(comentario);
			if (fecha!=null) reseniaTemporal.setFecha(fecha);
			reseniaRepository.save(reseniaTemporal);	
		}//if
	else {
		System.out.println("No existe la reseña con el id: "+id);
	}//else
	return reseniaTemporal;
}//updateResenia

	public List<resenia> getComentario() {
		
		return null;
	}
	
	

}//class reseniaService
