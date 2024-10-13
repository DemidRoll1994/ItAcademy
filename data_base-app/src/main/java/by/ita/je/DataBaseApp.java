package by.ita.je;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DataBaseApp {

	@GetMapping("/")
	public String home(){
		return "DataBaseApp is here";
	}

	public static void main(String[] args) {
		SpringApplication.run(DataBaseApp.class, args);
	}

}
