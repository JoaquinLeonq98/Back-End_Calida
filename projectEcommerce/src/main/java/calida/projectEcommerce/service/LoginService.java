package calida.projectEcommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import calida.projectEcommerce.model.Login;

@Service
public class LoginService {
	private final LoginRepository loginRepository;
	
	@Autowired
	public LoginService(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}//constructor LoginService

	public Login addLogin(Login login) {
		Login tmpLogin = null;
		Optional<Login> loginByCorreo=loginRepository.findByCorreo(login.getCorreo());
		if(loginByCorreo.isPresent()) {
			throw new IllegalStateException("El usuario con el correo "
					+ login.getCorreo() + " , ya existe."); 	
		} else {
			loginRepository.save(login);
			tmpLogin = login;
		}//else 
		return tmpLogin;
	}//add Login
	
	
	
	
}//class LoginService
