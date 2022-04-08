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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calida.projectEcommerce.model.Metodo;
import calida.projectEcommerce.service.MetodoService;

@RestController
@RequestMapping(path="/api/metodo/")
public class MetodoController {
	private final MetodoService metodoService;

	@Autowired
	public MetodoController(MetodoService metodoService) {
		this.metodoService = metodoService;
	}//constructor
	
	@GetMapping
	public List<Metodo> getMetodos(){
		return metodoService.getMetodos();
	}//get Metodos (plural)
	
	@GetMapping(path="{Id}")
	public Metodo getMetodo(@PathVariable("Id") Long id) {
		return metodoService.getMetodo(id);
	}//get Metodo (singular)
	
	@DeleteMapping(path="{Id}")
	public void deleteMetodo(@PathVariable ("Id") Long id) {
		metodoService.deleteMetodo(id);
	}//deleteusuario
	
	@PostMapping
	public void addMetodo(@RequestBody Metodo metodo) {
		metodoService.addMetodo(metodo);
	}//addMetodo
	
	@PutMapping
	public void updateMetodo(@RequestBody Metodo metodo) {
		metodoService.updateMetodo(metodo);
	}//updateMetodo
	
	
	
	
}//class MetodoController
