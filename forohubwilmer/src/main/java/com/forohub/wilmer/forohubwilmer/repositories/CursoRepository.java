package com.forohub.wilmer.forohubwilmer.repositories;

import com.forohub.wilmer.forohubwilmer.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
