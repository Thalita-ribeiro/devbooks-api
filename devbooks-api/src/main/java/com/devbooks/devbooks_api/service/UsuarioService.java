package com.devbooks.devbooks_api.service;

import com.devbooks.devbooks_api.model.dto.UsuarioCadastroDTO;
import com.devbooks.devbooks_api.model.entity.Usuario;
import com.devbooks.devbooks_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvar(UsuarioCadastroDTO dto) {
        Usuario usuario = new Usuario();

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        usuario.setDataCadastro(LocalDateTime.now());

        usuarioRepository.save(usuario);
    }
}
