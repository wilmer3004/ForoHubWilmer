package com.forohub.wilmer.forohubwilmer.services;


import com.forohub.wilmer.forohubwilmer.dtos.DatosRespuesta;
import com.forohub.wilmer.forohubwilmer.models.Respuesta;

import java.util.List;

public interface RespuestaService {

    public List<DatosRespuesta> listRespuesta();
    public DatosRespuesta findByIdRespuesta(Long id);
    public void addRespuesta(DatosRespuesta datosRespuesta);
    public void updateRespuesta(DatosRespuesta datosRespuesta, Long id);
    public void deleteRespuesta(Long id);

}
