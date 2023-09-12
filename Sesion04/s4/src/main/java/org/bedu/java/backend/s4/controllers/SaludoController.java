package org.bedu.java.backend.s4.controllers;

import org.bedu.java.backend.s4.models.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo/{nombre}") //lectura
    public Saludo saluda(@PathVariable String nombre){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola Mundo!!!");
        saludo.setNombre(nombre);

        return saludo;
    }
}
