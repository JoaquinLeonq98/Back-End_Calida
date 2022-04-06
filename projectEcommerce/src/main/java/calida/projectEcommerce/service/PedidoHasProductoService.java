package calida.projectEcommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import calida.projectEcommerce.model.PedidoHasProducto;

@Service
public class PedidoHasProductoService {
	private final PedidoHasProductoRepository phaspRepository;
	
	public PedidoHasProductoService(PedidoHasProductoRepository phaspRepository) {
		this.phaspRepository = phaspRepository;
	}//constructor

	public List<PedidoHasProducto> getPedidoHasProductos() {
		return phaspRepository.findAll();
	}//get (plural)

	public PedidoHasProducto getPedidoHasProducto(Long id) {
		return phaspRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("El pedido con el id " + id + " no existe.")
				);
	}//get (singular)

	public void deletePedidoHasProducto(Long id) {
		if (phaspRepository.existsById(id)) {
			phaspRepository.deleteById(id);
		}//if exist
	}//delete

	public void addPedidoHasProducto(PedidoHasProducto phasp) {
		phaspRepository.save(phasp);		
	}//add

}//class service
