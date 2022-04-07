package calida.projectEcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import calida.projectEcommerce.jwt.config.JwtFilter;


@SpringBootApplication
public class ProjectEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEcommerceApplication.class, args);
	}//main
	
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter() {
		FilterRegistrationBean<JwtFilter> registrationBean = 
				new FilterRegistrationBean<JwtFilter>(); //constructor
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/cliente/*");
		//registrationBean.addUrlPatterns("/api/productos/*");
		return registrationBean;
	}//jwtFilter 
	 
}//class ProjectEcommerceApplication
