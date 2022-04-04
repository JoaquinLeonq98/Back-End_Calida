package calida.projectEcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.Metodo;

@Service
public class MetodoService {
	private final MetodoRepository metodoRepository;

	public MetodoService(MetodoRepository metodoRepository) {
		this.metodoRepository = metodoRepository;
	}//constructor

	public List<Metodo> getMetodos() {
		return metodoRepository.findAll();
	}//getMetodos

	public Metodo getMetodo(Long id) {
		return metodoRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("El método con el id " + id + " no existe.")
				);
	}//getMetodo

	public void deleteMetodo(Long id) {
		if (metodoRepository.existsById(id)) {
			metodoRepository.deleteById(id);
		}//if exist
	}//deleteUsuario

	public void addMetodo(Metodo metodo) {
		Optional<Metodo> metodoByName=metodoRepository.findByPago(metodo.getPago());
		if(metodoByName.isPresent()) {
			throw new IllegalStateException("El metodo  " + metodo.getPago() + " ya existe.");
		} else {
			metodoRepository.save(metodo);
		}//else
	}//addMetodo

	public void updateMetodo(Metodo metodo) {
		Optional<Metodo> metodoByName=metodoRepository.findByPago(metodo.getPago());
		if(metodoByName.isPresent()) {
			Metodo m = metodoByName.get();
			if (m.getPago().equals(metodo.getPago())){
				m.setPago(metodo.getPago());
				metodoRepository.save(m);
			}//Pago
		}//if isPresent
	}//updateMetodo
	
	
	
	
}//class MetodoService
