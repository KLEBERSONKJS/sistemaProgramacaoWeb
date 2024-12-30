package com.ads.pwb.sistemaProgramacaoWeb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    @JsonProperty("nome")
    private String nome;

    @Column
    @JsonProperty("senha")
    private String senha;

    @Column
    @JsonProperty("email")
    private String email;
}
