package com.ads.pwb.sistemaProgramacaoWeb.controller;

import com.ads.pwb.sistemaProgramacaoWeb.model.Usuario;
import com.ads.pwb.sistemaProgramacaoWeb.record.DadosCadastroUsuario;
import com.ads.pwb.sistemaProgramacaoWeb.service.UsuarioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarPessoas();
    }

    @PostMapping
    @Transactional
    @RequestMapping("/cadastrar")
    public String cadastrarUsuario(@RequestBody DadosCadastroUsuario dadosCadastroUsuario){
        usuarioService.cadastrar(new Usuario(dadosCadastroUsuario));
        return "Usuario cadastrador";
    }

    @DeleteMapping
    @Transactional
    public String deletarUsuario(@RequestBody DadosCadastroUsuario dadosCadastroUsuario){
        try {
            usuarioService.deletar(new Usuario(dadosCadastroUsuario));
            return "Usuario Deletado";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
