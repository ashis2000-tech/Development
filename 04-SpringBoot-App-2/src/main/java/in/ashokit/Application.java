package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages= {"in.ashokit","com.willmart"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	@Bean
	public AppSecurity createInstance() {
		AppSecurity as = new AppSecurity();
		return as;

	}

}

