package com.forohub.wilmer.forohubwilmer.services;


import com.forohub.wilmer.forohubwilmer.models.Respuesta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RespuestaService {

    public List<Respuesta> listRespuesta();
    public Respuesta findByIdRespuesta(Long id);
    public void addRespuesta(Respuesta respuesta);
    public void updateRespuesta(Respuesta respuesta);
    public void deleteRespuesta(Long id);

}
