package com.forohub.wilmer.forohubwilmer.dtos;

import jakarta.persistence.Column;

import java.util.Date;

public record DatosRespuesta(
        String mensaje,
        Date fechaCreacion,
        String solucion
) {
}
