package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosCurso;
import com.forohub.wilmer.forohubwilmer.dtos.DatosRespuesta;
import com.forohub.wilmer.forohubwilmer.models.Curso;
import com.forohub.wilmer.forohubwilmer.models.Respuesta;
import com.forohub.wilmer.forohubwilmer.repositories.RespuestaRepository;
import com.forohub.wilmer.forohubwilmer.services.RespuestaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RespuestaServiceImpl implements RespuestaService {

    //Inyeccion de dependencia
    @Autowired
    private RespuestaRepository respuestaRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<DatosRespuesta> listRespuesta() {
        List<Respuesta> respuestaList = respuestaRepository.findAll();
        List<DatosRespuesta> datosRespuestas = new ArrayList<>();

        respuestaList.forEach(respuesta -> datosRespuestas.add(modelMapper.map(respuesta, DatosRespuesta.class)));

        return datosRespuestas;
    }

    @Override
    public DatosRespuesta findByIdRespuesta(Long id) {
        return modelMapper.map(respuestaRepository.findById(id), DatosRespuesta.class);
    }

    @Override
    public void addRespuesta(DatosRespuesta datosRespuesta) {
        respuestaRepository.save(modelMapper.map(datosRespuesta, Respuesta.class));
    }

    @Override
    public void updateRespuesta(DatosRespuesta datosRespuesta, Long id) {
        Respuesta respuesta = modelMapper.map(datosRespuesta, Respuesta.class);
        respuesta.setId(id);
        respuestaRepository.save(respuesta);
    }

    @Override
    public void deleteRespuesta(Long id) {
        respuestaRepository.deleteById(id);
    }
}
