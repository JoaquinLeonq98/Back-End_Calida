package calida.projectEcommerce.service;

import java.sql.Date;
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
					pedidosRepository.findByDate(pedido.getFecha());
			if(pedidoByDate.isPresent()) {
				throw new IllegalStateException("El pedido realizado en:  "
						+ pedido.getFecha() + "Ya existe");
				}else {
					pedidosRepository.save(pedido);
				}//else
		}//PostPedido

		public Pedido updatePedido(Long id, Date fecha, Boolean status_entrega, Boolean status_pago) {
			Pedido tmpProducto = null;
			if(pedidosRepository.existsById(id)) {
				tmpProducto = pedidosRepository.findById(id).get();
				if (fecha!=null) tmpProducto.setFecha(fecha);
				if (status_entrega!= null) tmpProducto.setStatus_entrega(status_entrega);
				if (status_pago!=null) tmpProducto.setStatus_pago(status_pago);
					pedidosRepository.save(tmpProducto);
			}else {
				System.out.println("No existe el pedido con el id " + id);
			}//else //if
			
			return tmpProducto;
			
		}//updatePedido


		
		
		
}//ClassPediosService
