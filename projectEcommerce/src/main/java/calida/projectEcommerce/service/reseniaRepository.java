package calida.projectEcommerce.service;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import calida.projectEcommerce.model.resenia;

public interface reseniaRepository extends JpaRepository<resenia, Long> {
	@Query("SELECT c FROM Producto c WHERE c.resenia=?50")
	Optional<resenia>findByProducto(int producto);
	
}//Interface reseniaRepository
