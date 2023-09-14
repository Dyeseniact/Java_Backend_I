package org.bedu.java.backend.s5.e2.model;

import org.springframework.stereotype.Component;

@Component //
public class SaludoComponent {

    private final String nombre;

    public SaludoComponent(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
