package com.forohub.wilmer.forohubwilmer.services;

import com.forohub.wilmer.forohubwilmer.dtos.DatosCurso;

import java.util.List;

public interface CursoService {

    public List<DatosCurso> listCurso();
    public DatosCurso findByIdCurso(Long id);
    public void addCurso(DatosCurso datosCurso);
    public void updateCurso(DatosCurso datosCurso, Long id);
    public void deleteCurso(Long id);


}
