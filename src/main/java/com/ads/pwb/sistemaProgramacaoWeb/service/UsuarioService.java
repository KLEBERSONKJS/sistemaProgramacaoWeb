package com.ads.pwb.sistemaProgramacaoWeb.service;

import com.ads.pwb.sistemaProgramacaoWeb.model.Usuario;
import com.ads.pwb.sistemaProgramacaoWeb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> listarPessoas() {
       return usuarioRepository.findAll();

    }

    public Usuario cadastrar(Usuario usuario){
        usuarioRepository.save(usuario);
        return usuario;
    }

    public Boolean autenticar(Usuario usuario){
        if(usuarioRepository.findAll().contains(usuario)){
            return true;
        }
        return false;
    }
}
