package org.bedu.java.backend.s6.e2.controller;

import org.bedu.java.backend.s6.e2.model.Direccion;
import org.bedu.java.backend.s6.e2.model.UsuarioE2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    @PostMapping
    public String creaUsuario(@RequestBody UsuarioE2 usuario){
        System.out.println("Creando usuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());

        Direccion direccion = new Direccion();
        direccion.setCalle("Juarez");
        direccion.setNumero("123");
        direccion.setCodigoPostal("55555");

        usuario.setDireccion(direccion);

        return "Usuario creado!!!";
    }
}
