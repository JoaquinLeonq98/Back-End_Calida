package calida.projectEcommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calida.projectEcommerce.model.Admin;
import calida.projectEcommerce.service.AdminsService;

@RestController
@RequestMapping(path="/api/admin/")
public class AdminsController {
	private final AdminsService adminsService;
	@Autowired
	public AdminsController(AdminsService adminsService) {
		this.adminsService = adminsService;
	} //constructor AdminsController
	
	@PostMapping
	public String Admins(@RequestBody Admin admin) {
		return adminsService.validateAdmin(admin);	
	}//login admin
}

