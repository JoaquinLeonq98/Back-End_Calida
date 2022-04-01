package calida.projectEcommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import calida.projectEcommerce.model.Login;
import calida.projectEcommerce.service.LoginService;

@RestController
@RequestMapping(path="api/login/")
public class LoginController {
	private final LoginService loginService;
	@Autowired
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}//constructor LoginController
	
	@PostMapping
	public Login addLogin(@RequestBody Login login) {
		return loginService.addLogin(login);
	}//addLogin
}//class LoginController
