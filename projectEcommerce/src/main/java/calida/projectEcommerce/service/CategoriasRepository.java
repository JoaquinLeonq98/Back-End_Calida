/*packages and imports*/
package calida.projectEcommerce.service;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import calida.projectEcommerce.model.Categoria;


public interface CategoriasRepository extends JpaRepository<Categoria, Long>  {
	@Query("SELECT categ FROM Categoria categ WHERE categ.nombre=?1")	 //JPQL usado para consultas
	Optional<Categoria> findByNombre(String nombre);
	//Si optional ecuentra el producto lo regresa. Si no, no pasa nada es opcional


}//interface CategoriasRepository
