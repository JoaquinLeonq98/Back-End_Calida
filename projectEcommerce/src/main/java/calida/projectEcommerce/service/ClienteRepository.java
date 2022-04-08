package calida.projectEcommerce.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import calida.projectEcommerce.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	@Query("SELECT c FROM Cliente c WHERE c.correo=?3")
	Optional<Cliente> findByCorreo(String correo);

}//interface ClienteRepository
