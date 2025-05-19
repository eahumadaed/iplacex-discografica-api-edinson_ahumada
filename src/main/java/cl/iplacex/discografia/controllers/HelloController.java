package cl.iplacex.discografica.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "¡Bienvenido a la API de discografías de IPLACEX!";
    }
}
