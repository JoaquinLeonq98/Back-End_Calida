package calida.projectEcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import calida.projectEcommerce.model.Pedido;

@Service
public class PedidosService {

		private final PedidosRepository pedidosRepository;
		@Autowired
		
		public PedidosService(PedidosRepository pedidosRepository) {
			 this.pedidosRepository = pedidosRepository;
		}//constructor
		
		public List<Pedido> getPedidos() {
		return pedidosRepository.findAll();
		}//GetPedidos

		public Pedido getPedido(Long id) {
		
			return pedidosRepository.findById(id).orElseThrow(
					()-> new IllegalStateException
					("El Pedido con el id " + id +  " no existe"));
		}//GetPedido

		public void deletePedido(Long id) {
			if (pedidosRepository.existsById(id)) {
				pedidosRepository.deleteById(id);
			}//if exists
		}//DeletePedido

		public void addPedido(Pedido pedido) {
			Optional<Pedido> pedidoByDate = 
					pedidosRepository.findByFecha(fecha.getFecha());		
		}//PostPedido
		
		
}//ClassPediosService
