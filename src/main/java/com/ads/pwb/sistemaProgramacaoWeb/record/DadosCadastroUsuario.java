package com.ads.pwb.sistemaProgramacaoWeb.record;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

public record DadosCadastroUsuario(
        long id,
        String nome,
        String senha,
        String email) {
}
