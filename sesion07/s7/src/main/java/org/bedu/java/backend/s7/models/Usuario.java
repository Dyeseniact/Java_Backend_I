package org.bedu.java.backend.s7.models;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Usuario {
    @NotBlank(message = "El nombre de usuario es un campo obligatorio.")
    private String nombre;
    @NotBlank(message = "El correo de usuario es un campo obligatorio.")
    @Email(message = "El correo electrónico tiene un formato incorrecto.")
    private String correo;
    @NotBlank(message = "El usuario es un campo obligatorio.")
    @Length(min = 8, max = 20, message = "Usuario debe tener entre 8 y 20 caracteres")
    private String usuario;
    @NotBlank(message = "La contraseña es un campo obligatorio.")
    private String contrasenia;
    @NotBlank(message = "El telefono es un campo obligatorio.")
    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
    private String telefono;
    @NotBlank(message = "El rol del usuario es un campo obligatorio.")
    private String rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

