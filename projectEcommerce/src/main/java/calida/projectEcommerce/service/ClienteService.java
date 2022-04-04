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

	public String validateCliente(Cliente cliente) {
		String res="El usuario o contraseña son incorrectos";
		Optional<Cliente> userByEmail=clienteRepository.findByCorreo(cliente.getCorreo());
		if (userByEmail.isPresent()) {
			Cliente c = userByEmail.get();
			if (c.getContraseña().equals(cliente.getContraseña())){
				res="Usuario y contraseña validados";
			}//if password
		}//if isPresent
		return res;
	}//validateCliente
	
	
}//class ClienteService
