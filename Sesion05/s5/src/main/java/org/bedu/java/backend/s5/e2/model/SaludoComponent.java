package org.bedu.java.backend.s5.e2.model;

import org.springframework.stereotype.Component;

// Con component le indicamos a Spring que gestine
// las instancias del modelo y las inyecte donde las necesitemos
@Component
public class SaludoComponent {

    private final String nombre;

    public SaludoComponent() {
        this.nombre = "Beto";
    }

    public String getNombre() {
        return nombre;
    }
}
