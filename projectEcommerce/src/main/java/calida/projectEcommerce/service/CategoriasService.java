/*packages and imports*/
package calida.projectEcommerce.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.Categoria;


@Service
public class CategoriasService {
	private final CategoriasRepository categoriasRepository; 
	
	@Autowired
	public CategoriasService(CategoriasRepository categoriasRepository) {
		this.categoriasRepository = categoriasRepository;
	}//constructor CategoriasService

	public List<Categoria> getCategorias() {
		return categoriasRepository.findAll();
	}//getCategorias - trae todos

	public Categoria getCategoria(Long id) {
		return categoriasRepository.findById(id).orElseThrow(
				()-> new IllegalStateException(
			"El mensaje con el id: "+id+" no existe.")	);
	}//getCategoria

	public void deleteCategoria(Long id) {
		if(	categoriasRepository.existsById(id)) {
			categoriasRepository.deleteById(id);
		}//if si exite lo borra
	}//deleteCategoria

	public Categoria addCategoria(Categoria categoria) {
		Categoria categoriaTemporal = null;
		Optional<Categoria> categoriaByName=categoriasRepository.findByNombre(categoria.getNombre());
		if(categoriaByName.isPresent()) {
			throw new IllegalStateException("La categoria con el nombre: " + categoria.getNombre() + 
					", ya existe."); 	
		} else {
			categoriasRepository.save(categoria);
			categoriaTemporal = categoria;
		}//else 
		return categoriaTemporal;
	}//addCategoria

}//class CategoriasService
