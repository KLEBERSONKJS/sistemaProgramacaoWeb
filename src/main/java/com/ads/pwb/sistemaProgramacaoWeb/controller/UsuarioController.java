package com.ads.pwb.sistemaProgramacaoWeb.controller;

import com.ads.pwb.sistemaProgramacaoWeb.model.Usuario;
import com.ads.pwb.sistemaProgramacaoWeb.repository.UsuarioRepository;
import com.ads.pwb.sistemaProgramacaoWeb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarPessoas();
    }

    @PostMapping("/cadastro")
    public String cadastrarUsuario(@RequestBody Usuario usuario){
        usuarioService.cadastrar(usuario);
        return "Usuario cadastrador";
    }

    @GetMapping("/login")
    public String autentticarUsuario(@RequestBody Usuario usuario){
        return usuarioService.autenticar(usuario).toString();
    }
}
