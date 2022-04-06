package calida.projectEcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import calida.projectEcommerce.model.Admin;

public interface AdminsRepository extends JpaRepository<Admin, String> {
@Query("SELECT u From Admin u WHERE u.admin=?1")
Optional<Admin>findByCorreo(String correo);

List<Admin> findAll();

boolean existsByCorreo(String correo);

void deleteByCorreo(String correo);

}//interface AdminsRepository
