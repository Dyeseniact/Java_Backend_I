package org.bedu.java.backend.s5.e2.services;

import org.bedu.java.backend.s5.e2.model.SaludoComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //será interpretada como un servicio
public class SaludoService {

    private final SaludoComponent saludoComponent;
    private final SaludoComponent otroSaludo;
    @Autowired
    public SaludoService(SaludoComponent saludoComponent, SaludoComponent otroSaludo) {
        this.saludoComponent = saludoComponent;
        this.otroSaludo = otroSaludo;
        System.out.println(saludoComponent == otroSaludo);
    }

    public String saluda() {
        return "Hola " + saludoComponent.getNombre();
    }
}
