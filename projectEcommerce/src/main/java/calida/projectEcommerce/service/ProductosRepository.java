package calida.projectEcommerce.service;
import org.springframework.data.jpa.repository.JpaRepository;
import calida.projectEcommerce.model.Producto;

public interface ProductosRepository extends JpaRepository<Producto, Long> {
	

}//interface ProductosRepository
