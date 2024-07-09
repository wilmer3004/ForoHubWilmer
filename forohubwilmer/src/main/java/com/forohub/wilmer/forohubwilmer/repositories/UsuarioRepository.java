package com.forohub.wilmer.forohubwilmer.repositories;

import com.forohub.wilmer.forohubwilmer.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
