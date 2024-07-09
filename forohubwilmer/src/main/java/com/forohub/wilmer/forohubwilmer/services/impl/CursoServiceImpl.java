package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosCurso;
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
    public List<DatosCurso> listCurso() {
        return null;
    }

    @Override
    public DatosCurso findByIdCurso(Long id) {
        return null;
    }

    @Override
    public void addCurso(DatosCurso datosCurso) {

    }

    @Override
    public void updateCurso(DatosCurso datosCurso, Long id) {

    }

    @Override
    public void deleteCurso(Long id) {

    }
}
