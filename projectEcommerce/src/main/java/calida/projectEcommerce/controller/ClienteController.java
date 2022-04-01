package calida.projectEcommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PostMapping
	public Cliente addCliente(@RequestBody Cliente cliente) {
		return clienteService.addCliente(cliente);
	}//addCliente
	
}//class ClienteConttoller
