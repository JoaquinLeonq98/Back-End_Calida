package calida.projectEcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import calida.projectEcommerce.model.Admin;
import calida.projectEcommerce.model.Categoria;

@Service
public class AdminsService {
	private final AdminsRepository adminsRepository;
	
	@Autowired
	public AdminsService(AdminsRepository adminsRepository) {
		this.adminsRepository = adminsRepository;
	}//constructor adminsRepository
	
	public List<Admin> getAdmin() {
		return adminsRepository.findAll();
	}//getAdmin trae todos
	
	public Admin getCorreo(String correo) {
		return adminsRepository.findByCorreo(correo).orElseThrow(
				()-> new IllegalStateException(
			"El administrados con correo: "+correo+" no existe.")	);
	}//getAdmin
	
	public void deleteCorreo(String correo) {
		if(	adminsRepository.existsByCorreo(correo)) {
			adminsRepository.deleteByCorreo(correo);
		}//if 
	}//deleteAdmin
	
	public Admin addAdmin(Admin admin) {
		Admin adminTemporal = null;
		Optional<Admin> AdminByCorreo=adminsRepository.findByCorreo(admin.getCorreo());
		if(AdminByCorreo.isPresent()) {
			throw new IllegalStateException("El admin con el correo: " + admin.getCorreo() + 
					", ya existe."); 	
		} else {
			adminsRepository.save(admin);
			adminTemporal = admin;
		}//else 
		return adminTemporal;
	}//addAdmin
	
	
	public String validateAdmin(Admin admin) {
		String res="El administrador no existe";
		Optional<Admin>userByCorreo=adminsRepository.findByCorreo(admin.getCorreo());
		if(userByCorreo.isPresent()) {
			Admin c= userByCorreo.get();
			if(c.getContrasena().equals(admin.getContrasena())) {
				res="Administrador y contraseña validados";
			}//if
		}//if
		
		return res;
	}//validateAdmin

}//class AdminService
