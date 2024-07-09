package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosTopico;
import com.forohub.wilmer.forohubwilmer.models.Topico;
import com.forohub.wilmer.forohubwilmer.repositories.TopicoRepository;
import com.forohub.wilmer.forohubwilmer.services.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoServiceImpl implements TopicoService {

    //Inyeccion de dependencia
    @Autowired
    private TopicoRepository topicoRepository;

    @Override
    public List<DatosTopico> listTopico() {
        return List.of();
    }

    @Override
    public DatosTopico findByIdTopico(Long id) {
        return null;
    }

    @Override
    public void addTopico(DatosTopico datosTopico) {

    }

    @Override
    public void updateTopico(DatosTopico datosTopico, Long id) {

    }

    @Override
    public void deleteTopico(Long id) {

    }
}
