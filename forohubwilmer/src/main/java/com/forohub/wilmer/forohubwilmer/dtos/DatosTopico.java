package com.forohub.wilmer.forohubwilmer.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatosTopico{
        Long id;
        String titulo;
        String mensaje;
        Date fechaCreacion;
        Boolean status;
        Long idAutorFK;
        Long idCursoFK;
}
