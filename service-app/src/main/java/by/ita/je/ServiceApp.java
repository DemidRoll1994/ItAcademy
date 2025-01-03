package by.ita.je;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceApp {

	@GetMapping("/")
	public String home(){
		return "ServiceApp is here";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceApp.class, args);
	}

}
