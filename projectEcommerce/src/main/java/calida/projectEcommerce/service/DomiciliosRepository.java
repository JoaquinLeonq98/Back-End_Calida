/*packages and imports*/
package calida.projectEcommerce.service;
import java.util.Optional;
import calida.projectEcommerce.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DomiciliosRepository extends JpaRepository<Domicilio, Long>{
	@Query("SELECT dom FROM Domicilio dom WHERE dom.calle=?1")
			Optional<Domicilio>findByCalle(String calle);
}//interface DomiciliosRepository
