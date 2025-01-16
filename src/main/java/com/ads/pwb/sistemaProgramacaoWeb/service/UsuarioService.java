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

    @Autowired
    EmailService emailService;

    public List<Usuario> listarPessoas() {
       return usuarioRepository.findAll();

    }

    public Usuario cadastrar(Usuario usuario){
        usuarioRepository.save(usuario);
        emailService.enviarEmailCadastro(usuario.getEmail(), "Novo Usuario Cadastrado", "Parabens pelo seu Cadastro em Nosso site.");
        return usuario;
    }

    public Boolean autenticar(Usuario usuario){
        if(usuarioRepository.findAll().contains(usuario)){
            return true;
        }
        return false;
    }

    public Usuario deletar(Usuario usuarioDeletado){

        try {
            usuarioRepository.deleteById(usuarioDeletado.getId());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return usuarioDeletado;
    }

}
