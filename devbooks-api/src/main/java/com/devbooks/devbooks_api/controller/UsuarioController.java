package com.devbooks.devbooks_api.controller;

import com.devbooks.devbooks_api.model.dto.UsuarioCadastroDTO;
import com.devbooks.devbooks_api.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> criar(@RequestBody @Valid UsuarioCadastroDTO dto) {
        usuarioService.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado com sucesso");
    }
}
