package calida.projectEcommerce.service;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import calida.projectEcommerce.model.Producto;

public interface ProductosRepository extends JpaRepository<Producto, Long> {
	@Query("SELECT product FROM Producto product WHERE product.nombre=?1")	 //JPQL usado para consultas
	Optional<Producto> findByNombre(String nombre);
	//Si optional ecuentra el producto lo regresa. Si no, no pasa nada es opcional

}//interface ProductosRepository
