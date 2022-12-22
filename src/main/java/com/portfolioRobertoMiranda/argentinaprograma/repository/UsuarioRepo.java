package com.portfolioRobertoMiranda.argentinaprograma.repository;

import com.portfolioRobertoMiranda.argentinaprograma.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
