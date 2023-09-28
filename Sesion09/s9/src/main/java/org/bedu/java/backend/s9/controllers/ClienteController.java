package org.bedu.java.backend.s9.controllers;

import org.bedu.java.backend.s9.models.Cliente;
import org.bedu.java.backend.s9.persistence.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private  final ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public ResponseEntity<Void> crearCliente(@RequestBody Cliente cliente) {
        Cliente clienteDB = clienteRepository.save(cliente);
        return ResponseEntity.created(URI.create(clienteDB.getId().toString())).build();
        //return ResponseEntity.status(HttpStatus.CREATED).body("Cliente creado con exito");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> actualizarCliente(@PathVariable("id") long id, @RequestBody Cliente cliente) {
        Cliente clienteDB = clienteRepository.findById(id).orElse(null);
        if (clienteDB == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro el Cliente con ese Id.");
        } else {
            clienteDB.setNombre(cliente.getNombre());
            clienteDB.setApellido(cliente.getApellido());
            clienteDB.setCorreo(cliente.getCorreo());
            clienteDB.setNacimiento(cliente.getNacimiento());
            clienteRepository.save(clienteDB);
            return ResponseEntity.status(HttpStatus.OK).body(cliente);
        }
    }

   @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarCliente(@PathVariable("id") long id) {
        Optional<Cliente> clienteDB = clienteRepository.findById(id);
        if (!clienteDB.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro el Cliente con ese Id.");
        } else {
            clienteRepository.delete(clienteDB.get());
            return  ResponseEntity.status(HttpStatus.OK).body("Cliente eliminado");
        }
    }

    @GetMapping("/obtener")
    public ResponseEntity<?> obtenerClientes(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll());
    }



}