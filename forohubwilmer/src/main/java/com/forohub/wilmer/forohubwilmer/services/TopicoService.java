package com.forohub.wilmer.forohubwilmer.services;

import com.forohub.wilmer.forohubwilmer.dtos.DatosTopico;
import com.forohub.wilmer.forohubwilmer.models.Topico;

import java.util.List;

public interface TopicoService {

    public List<DatosTopico> listTopico();
    public DatosTopico findByIdTopico(Long id);
    public void addTopico(DatosTopico datosTopico);
    public void updateTopico(DatosTopico datosTopico, Long id);
    public void deleteTopico(Long id);

}
