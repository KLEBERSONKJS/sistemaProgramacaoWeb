package com.ads.pwb.sistemaProgramacaoWeb.model;

import com.ads.pwb.sistemaProgramacaoWeb.record.DadosCadastroUsuario;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@Entity
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nome;

    @Column
    private String senha;

    @Column
    private String email;

    public Usuario(DadosCadastroUsuario dadosCadastroUsuario) {
        this.id = dadosCadastroUsuario.id();
        this.email = dadosCadastroUsuario.email();
        this.nome = dadosCadastroUsuario.nome();
        this.senha = dadosCadastroUsuario.senha();

    }

    public long getId() {
        return id;
    }
}
