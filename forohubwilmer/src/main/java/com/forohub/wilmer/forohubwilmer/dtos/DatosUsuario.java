package com.forohub.wilmer.forohubwilmer.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatosUsuario{
        Long id;
        String nombre;
        String correoElectronico;
        String contrasena;
}
