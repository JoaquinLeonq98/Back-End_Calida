package calida.projectEcommerce.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calida.projectEcommerce.jwt.config.JwtFilter;
import calida.projectEcommerce.model.Cliente;
import calida.projectEcommerce.model.Token;
import calida.projectEcommerce.service.ClienteService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="api/login/")
@CrossOrigin
public class LoginController {
	private final ClienteService clienteService;
	@Autowired
	public LoginController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}//constructor LoginController
	
	@PostMapping//se pone en post para que no se escriba en el URL
	public Token login(@RequestBody Cliente cliente) throws ServletException {
		if (clienteService.validateCliente(cliente)) {
		return new Token(generateToken(cliente.getCorreo()));
	}//if
	throw new ServletException("Usuario o contraseña incorrectos");
	}//login
	
	private String generateToken(String correo) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, 10);
		return Jwts.builder().setSubject(correo).claim("role", "user")
				.setIssuedAt(new Date()).setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256, JwtFilter.secret).compact();
	}// generateToken

}//class LoginController
