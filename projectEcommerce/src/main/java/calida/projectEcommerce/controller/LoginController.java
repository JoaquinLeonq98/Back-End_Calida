package calida.projectEcommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import calida.projectEcommerce.model.Cliente;
import calida.projectEcommerce.service.ClienteService;

@RestController
@RequestMapping(path="api/login/")
public class LoginController {
	private final ClienteService clienteService;
	@Autowired
	public LoginController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}//constructor LoginController
	
	@PostMapping//se pone en post para que no se escriba en el URL
	public String login(@RequestBody Cliente cliente) {
		return clienteService.validateCliente(cliente);
	}//login
}//class LoginController
