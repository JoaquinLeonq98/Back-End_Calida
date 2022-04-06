package calida.projectEcommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calida.projectEcommerce.model.CambiarContrasena;
import calida.projectEcommerce.model.Cliente;
import calida.projectEcommerce.service.ClienteService;

@RestController
@RequestMapping(path="api/cliente/")
public class ClienteController {
	private final ClienteService clienteService;
	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}//constructor ClienteController
	
	@GetMapping
	public List<Cliente> getClientes(){
		return clienteService.getClientes();
	}//getClientes
	
	@GetMapping(path="{Id}")
	public Cliente getCliente(@PathVariable("Id") Long id) {
	return clienteService.getCliente(id);
	}//get cliente
	
	@DeleteMapping(path="{Id}")
	public void deleteCliente(@PathVariable ("Id") Long id) {
		clienteService.deleteCliente(id);
	}//delete cliente
	
	@PostMapping
	public void addCliente(@RequestBody Cliente cliente) {
		clienteService.addCliente(cliente);
	}//addCliente
	
	@PutMapping
	public void updateCliente(@RequestBody CambiarContrasena cambiarContrasena) {
		clienteService.updateCliente(cambiarContrasena);
	}//updateCliente
	
}//class ClienteConttoller
