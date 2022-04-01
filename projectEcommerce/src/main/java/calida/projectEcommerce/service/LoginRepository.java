package calida.projectEcommerce.service;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import calida.projectEcommerce.model.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
	@Query("SELECT l FROM Login l WHERE l.correo=?1")
	Optional<Login> findByCorreo(String correo);
}//interface LoginRepository
