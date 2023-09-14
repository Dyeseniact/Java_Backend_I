package org.bedu.java.backend.s5.e2.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Con component le indicamos a Spring que gestine
// las instancias del modelo y las inyecte donde las necesitemos
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Crea diferentes instancias del mismo
public class SaludoComponent {

    private final String nombre;

    public SaludoComponent() {
        this.nombre = "Beto";
        System.out.println("Creando una instancia de Saludo");

    }

    public String getNombre() {
        return nombre;
    }
}
