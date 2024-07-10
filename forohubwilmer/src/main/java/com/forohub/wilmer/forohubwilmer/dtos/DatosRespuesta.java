package com.forohub.wilmer.forohubwilmer.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatosRespuesta{
        Long id;
        String mensaje;
        Date fechaCreacion;
        String solucion;
}
