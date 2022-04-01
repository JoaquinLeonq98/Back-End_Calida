package calida.projectEcommerce.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import calida.projectEcommerce.model.Cliente;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}//Constructor ClienteService

	public Cliente addCliente(Cliente cliente) {
		Cliente tmpCliente = null;
		Optional<Cliente> clienteByCorreo=clienteRepository.findByCorreo(cliente.getCorreo());
		if(clienteByCorreo.isPresent()) {
			throw new IllegalStateException("El usuario con el corrreo "
					+ cliente.getCorreo() + " ya existe."); 	
		} else {
			clienteRepository.save(cliente);
			tmpCliente = cliente;
		}//else 
		return tmpCliente;
	}//addCliente
	
	
}//class ClienteService
