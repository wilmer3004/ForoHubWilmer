package com.forohub.wilmer.forohubwilmer.repositories;

import com.forohub.wilmer.forohubwilmer.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByCorreoElectronico(String username);

    @Query("SELECT u FROM Usuario u WHERE u.correoElectronico = :correo")
    Usuario findByCorreoElectronico2(@Param("correo") String correo);
}
