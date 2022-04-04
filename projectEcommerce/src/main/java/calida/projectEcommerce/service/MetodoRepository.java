package calida.projectEcommerce.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import calida.projectEcommerce.model.Metodo;

public interface MetodoRepository extends JpaRepository<Metodo, Long> {
	@Query("SELECT m FROM Metodo m WHERE m.pago=?1")
	Optional<Metodo> findByPago (String pago);
}//interface MetodoRepository
