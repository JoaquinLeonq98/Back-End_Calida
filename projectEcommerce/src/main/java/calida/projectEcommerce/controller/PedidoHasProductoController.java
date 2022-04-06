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

import calida.projectEcommerce.model.PedidoHasProducto;
import calida.projectEcommerce.service.PedidoHasProductoService;

@RestController
@RequestMapping(path="/api/pedidohasproducto/")
public class PedidoHasProductoController {
	private final PedidoHasProductoService phaspService;
	
	@Autowired
	public PedidoHasProductoController(PedidoHasProductoService phaspService) {
		this.phaspService = phaspService;
	}//constructor
	
	@GetMapping
	public List<PedidoHasProducto> getPedidoHasProductos(){
		return phaspService.getPedidoHasProductos();
	}//get (plural)
	
	@GetMapping(path="{Id}")
	public PedidoHasProducto getPedidoHasProducto(@PathVariable("Id") Long id) {
	return phaspService.getPedidoHasProducto(id);
	}//get (singular)
	
	@DeleteMapping(path="{Id}")
	public void deletePedidoHasProducto(@PathVariable("Id") Long id) {
		phaspService.deletePedidoHasProducto(id);
	}//delete phasp
	
	@PostMapping
	public void addPedidoHasProducto(@RequestBody PedidoHasProducto phasp) {
		phaspService.addPedidoHasProducto(phasp);
	}//add phasp
	
}//class PedidoController
