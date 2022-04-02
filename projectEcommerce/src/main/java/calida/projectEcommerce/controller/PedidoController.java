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

import calida.projectEcommerce.model.Pedido;
import calida.projectEcommerce.service.PedidosService;


@RestController
@RequestMapping(path= "/api/pedido/")
public class PedidoController {

	private final PedidosService pedidosService;
	
	@Autowired
	public PedidoController(PedidosService pedidosService) {
		this.pedidosService = pedidosService;
	}//constructor

	@GetMapping
	public List<Pedido> getPedidos(){
			return pedidosService.getPedidos();
	}//GetPedidos
	
	@GetMapping(path="{prodId}")
	public Pedido getPedido(@PathVariable("prodId") Long id) {
		return pedidosService.getPedido(id);
	}//GetPedido
	
	@DeleteMapping(path="{prodId}")
	public  void deletePedido(@PathVariable("prodId") Long id) {
		pedidosService.deletePedido(id);
	}//DeletePedido
	
	@PostMapping
	public void addPedido(@RequestBody Pedido pedido) {
		pedidosService.addPedido(pedido);
	}//addProducto
	
	
}//CLassPedidoControler
