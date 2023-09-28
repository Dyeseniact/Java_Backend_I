package org.bedu.java.backend.s9.persistence;

import org.bedu.java.backend.s9.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
