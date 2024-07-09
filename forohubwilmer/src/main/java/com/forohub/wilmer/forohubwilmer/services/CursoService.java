package com.forohub.wilmer.forohubwilmer.services;

import com.forohub.wilmer.forohubwilmer.models.Curso;

import java.util.List;

public interface CursoService {

    public List<Curso> listCurso();
    public Curso findByIdCurso(Long id);
    public void addCurso(Curso curso);
    public void updateCurso(Curso curso);
    public void deleteCurso(Long id);


}
