package cl.iplacex.discografia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiscografiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscografiaApplication.class, args);
	}

}

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "¡Bienvenido a la API de discografías!";
    }
}
