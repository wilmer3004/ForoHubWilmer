package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.models.Curso;
import com.forohub.wilmer.forohubwilmer.repositories.CursoRepository;
import com.forohub.wilmer.forohubwilmer.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    //inyeccion de dependencia
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> listCurso() {
        return List.of();
    }

    @Override
    public Curso findByIdCurso(Long id) {
        return null;
    }

    @Override
    public void addCurso(Curso curso) {

    }

    @Override
    public void updateCurso(Curso curso) {

    }

    @Override
    public void deleteCurso(Long id) {

    }
}
