package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.models.Respuesta;
import com.forohub.wilmer.forohubwilmer.repositories.RespuestaRepository;
import com.forohub.wilmer.forohubwilmer.services.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaServiceImpl implements RespuestaService {

    //Inyeccion de dependencia
    @Autowired
    private RespuestaRepository respuestaRepository;

    @Override
    public List<Respuesta> listRespuesta() {
        return List.of();
    }

    @Override
    public Respuesta findByIdRespuesta(Long id) {
        return null;
    }

    @Override
    public void addRespuesta(Respuesta respuesta) {

    }

    @Override
    public void updateRespuesta(Respuesta respuesta) {

    }

    @Override
    public void deleteRespuesta(Long id) {

    }
}
