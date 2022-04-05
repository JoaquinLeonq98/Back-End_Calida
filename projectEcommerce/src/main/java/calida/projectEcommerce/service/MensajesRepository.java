package calida.projectEcommerce.service;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import calida.projectEcommerce.model.Mensaje;


public interface MensajesRepository extends JpaRepository<Mensaje, Long>{	
	@Query("SELECT message FROM Mensaje message WHERE message.correo=?1")	 //JPQL usado para consultas
	Optional<Mensaje> findByCorreo(String correo);
	//Si optional ecuentra el producto lo regresa. Si no, no pasa nada es opcional

}//interface MensajesRepository 
