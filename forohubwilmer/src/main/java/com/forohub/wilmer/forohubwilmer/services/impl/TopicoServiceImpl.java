package com.forohub.wilmer.forohubwilmer.services.impl;

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
    public List<Topico> listTopico() {
        return List.of();
    }

    @Override
    public Topico findByIdTopico(Long id) {
        return null;
    }

    @Override
    public void addTopico(Topico topico) {

    }

    @Override
    public void updateTopico(Topico topico) {

    }

    @Override
    public void deleteTopico(Long id) {

    }
}
