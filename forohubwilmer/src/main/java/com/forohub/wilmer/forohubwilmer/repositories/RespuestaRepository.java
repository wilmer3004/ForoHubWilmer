package com.forohub.wilmer.forohubwilmer.repositories;

import com.forohub.wilmer.forohubwilmer.models.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
}
