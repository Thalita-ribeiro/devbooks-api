package com.devbooks.devbooks_api.repository;

import com.devbooks.devbooks_api.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
