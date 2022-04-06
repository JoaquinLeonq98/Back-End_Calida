package calida.projectEcommerce.service;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import calida.projectEcommerce.model.CambiarContrasena;
import calida.projectEcommerce.model.Cliente;
import calida.projectEcommerce.utils.SHAUtils;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}//Constructor ClienteService
	
	public List<Cliente> getClientes() {
		return clienteRepository.findAll();
	}//getClientes

	public Cliente getCliente(Long id) {
		return clienteRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("El cliente con el id " + id + " no existe.")
				);
	}//getCliente
	
	public void deleteCliente(Long id) {
		if (clienteRepository.existsById(id)) {
			clienteRepository.deleteById(id);
		}//if exist
	}//deleteCliente
	
	public void addCliente(Cliente cliente) {
		Optional<Cliente> clienteByCorreo=clienteRepository.findByCorreo(cliente.getCorreo());
		if(clienteByCorreo.isPresent()) {
			throw new IllegalStateException("El cliente con el corrreo "
					+ cliente.getCorreo() + " ya existe."); 	
		} else {
			cliente.setContrasena(SHAUtils.createHash(cliente.getContrasena()));
			clienteRepository.save(cliente);
		}//else
	}//addCliente
	
	public void updateCliente(CambiarContrasena cambiarContrasena) {
		Optional<Cliente> clienteByCorreo=clienteRepository.findByCorreo(cambiarContrasena.getCorreo());
		if(clienteByCorreo.isPresent()) {
			Cliente c = clienteByCorreo.get();
			if (SHAUtils.verifyHash(cambiarContrasena.getContrasena(), c.getContrasena()) ) {
				c.setContrasena(SHAUtils.createHash(cambiarContrasena.getNuevaContrasena()) );
				clienteRepository.save(c);
			}//password
		}//if isPresent
	}//updateCliente

	public boolean validateCliente(Cliente cliente) {
		boolean res=false;
		Optional<Cliente> userByEmail=clienteRepository.findByCorreo(cliente.getCorreo());
		if (userByEmail.isPresent()) {
			Cliente c = userByEmail.get();
			if (SHAUtils.verifyHash(cliente.getContrasena(), c.getContrasena())) {
				res = true;
			}//if password
		}//if isPresent
		return res;
	}//validateCliente

	
	
}//class ClienteService
