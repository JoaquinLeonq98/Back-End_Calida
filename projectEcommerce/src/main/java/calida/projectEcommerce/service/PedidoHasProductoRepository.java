package calida.projectEcommerce.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import calida.projectEcommerce.model.PedidoHasProducto;

public interface PedidoHasProductoRepository extends JpaRepository<PedidoHasProducto, Long>{
	@Query("SELECT h FROM PedidoHasProducto h WHERE h.total=?3")
	Optional<PedidoHasProducto> findByTotal (double total);
}//interface
