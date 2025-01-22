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

    @Enumerated(EnumType.STRING)
    private Status status;

    public Usuario(DadosCadastroUsuario dadosCadastroUsuario) {
        this.id = dadosCadastroUsuario.id();
        this.email = dadosCadastroUsuario.email();
        this.nome = dadosCadastroUsuario.nome();
        this.senha = dadosCadastroUsuario.senha();
        this.status = Status.PENDENTE;

    }

    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Status getStatus() {
        return status;
    }
}

