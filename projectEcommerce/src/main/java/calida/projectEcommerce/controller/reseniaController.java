package calida.projectEcommerce.controller;
import java.util.Date;
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

import calida.projectEcommerce.model.resenia;
import calida.projectEcommerce.service.reseniaService;



@RestController
@RequestMapping(path="/api/reseña/")
public class reseniaController {
	
	private final reseniaService reseniaService;
	@Autowired
	public reseniaController(reseniaService reseniaService) {
		this.reseniaService = reseniaService;
	}//constructor reseniaController
	
	@GetMapping
	public List<resenia> getComentario(){
		return reseniaService.getComentario();
	}//getResenias todas
	
	@GetMapping (path="{reseId}")
	public resenia getComentario (@PathVariable("reseId")Long id) {
		return reseniaService.getResenias(id);
	}//getResenia, solo 1
	
	@DeleteMapping(path="{reseId}")
	public resenia deleteResenia(@PathVariable("reseId") Long id) {
		return reseniaService.deleteResenia(id);
	}//deleteResenia
	
	@PostMapping(path="/nueva") 
	public resenia addResenia(@RequestBody resenia Resenia) {
		return reseniaService.addresenia(Resenia);
	}//addResenia
	
	@PutMapping(path="{reseId}")
	public resenia updateresenia(
			@PathVariable("reseId") Long reseId,
			@RequestParam (required=false)double calificacion,
			@RequestParam (required=false) String comentario,
			@RequestParam (required=false)Date fecha,
			@RequestParam (required=false) int producto) {
			return reseniaService.updateresenia(reseId,calificacion,comentario,fecha, producto);
	}//updateResenia
	
}//classReseniaController
