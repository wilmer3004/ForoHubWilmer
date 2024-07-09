package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosCurso;
import com.forohub.wilmer.forohubwilmer.models.Curso;
import com.forohub.wilmer.forohubwilmer.repositories.CursoRepository;
import com.forohub.wilmer.forohubwilmer.services.CursoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    //inyeccion de dependencia
    @Autowired
    private CursoRepository cursoRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<DatosCurso> listCurso() {

        List<Curso> cursoList = cursoRepository.findAll();
        List<DatosCurso> datosCurso = new ArrayList<>();

        cursoList.forEach(curso -> datosCurso.add(modelMapper.map(curso, DatosCurso.class)));

        return datosCurso;
    }

    @Override
    public DatosCurso findByIdCurso(Long id) {
        return modelMapper.map(cursoRepository.findById(id), DatosCurso.class);
    }

    @Override
    public void addCurso(DatosCurso datosCurso) {
        cursoRepository.save(modelMapper.map(datosCurso, Curso.class));
    }

    @Override
    public void updateCurso(DatosCurso datosCurso, Long id) {
        Curso curso = modelMapper.map(datosCurso, Curso.class);
        curso.setId(id);
        cursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
