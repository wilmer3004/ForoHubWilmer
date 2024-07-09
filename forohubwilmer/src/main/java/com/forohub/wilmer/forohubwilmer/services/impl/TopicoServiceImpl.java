package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosTopico;
import com.forohub.wilmer.forohubwilmer.models.Topico;
import com.forohub.wilmer.forohubwilmer.repositories.TopicoRepository;
import com.forohub.wilmer.forohubwilmer.services.TopicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicoServiceImpl implements TopicoService {

    //Inyeccion de dependencia
    @Autowired
    private TopicoRepository topicoRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<DatosTopico> listTopico() {

        List<Topico> topicoList = topicoRepository.findAll();
        List<DatosTopico> datosTopicoList = new ArrayList<>();

        topicoList.forEach(topico -> datosTopicoList.add(modelMapper.map(topico, DatosTopico.class)));


        return datosTopicoList;
    }

    @Override
    public DatosTopico findByIdTopico(Long id) {
        return modelMapper.map(topicoRepository.findById(id), DatosTopico.class);
    }

    @Override
    public void addTopico(DatosTopico datosTopico) {
        topicoRepository.save(modelMapper.map(datosTopico, Topico.class));
    }

    @Override
    public void updateTopico(DatosTopico datosTopico, Long id) {
        Topico topico = modelMapper.map(datosTopico, Topico.class);
        topico.setId(id);
        topicoRepository.save(topico);
    }

    @Override
    public void deleteTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}
