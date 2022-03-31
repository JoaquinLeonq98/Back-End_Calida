package calida.backend.Proyecto_Calida.productos;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {
	public final ArrayList<Producto> lista = new ArrayList<Producto>();
	public ProductosService() {
		lista.add(
			new Producto(
				"Tamaño CH, de riego 1 vez a la semana, luz tipo resolana y semisombra.",
				 "Aglaonema roja.jpg",
				 "aglaonema roja",
				 151.00,
				10)		);
		lista.add(
			new Producto(
				"Tamaño CH, de riego 1 vez a la semana, luz tipo resolana, semisombra y luz artificia.",
				 "Aglaonema rosa.jpg",
				 "aglaonema rosa",
				 151.00,
				10)		);
		lista.add(
			new Producto(
				"Tamaño CH, de riego 1 o 2 veces por semana, luz tipo resolana, semisombra y soporta sol directo en pequeñas cantidades.",
				 "Amoena.JPG",
				 "amoena / amoena hoja reina",
				 79.00,
				10)		);
	}


}// class ProductosService
