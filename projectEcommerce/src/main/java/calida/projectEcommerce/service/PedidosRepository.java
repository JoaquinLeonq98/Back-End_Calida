package calida.projectEcommerce.service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import calida.projectEcommerce.model.Pedido;

public interface PedidosRepository extends JpaRepository<Pedido, Long> {

	@Query("SELECT p FROM Pedido p WHERE p.fecha=?1")
	Optional<Pedido> findByDate(Date fecha);
}
