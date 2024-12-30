package com.ads.pwb.sistemaProgramacaoWeb.repository;

import com.ads.pwb.sistemaProgramacaoWeb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
