package com.forohub.wilmer.forohubwilmer.controllers;

import com.forohub.wilmer.forohubwilmer.dtos.DatosRespuesta;
import com.forohub.wilmer.forohubwilmer.services.impl.RespuestaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/respuesta")
public class RespuestaController {


    //Inyeccion de dependencia
    @Autowired
    private RespuestaServiceImpl respuestaService;

    @GetMapping("/all")
    public ResponseEntity all(){
        return null;
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody DatosRespuesta datosRespuesta){
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody DatosRespuesta datosRespuesta, @PathVariable Long id){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return null;
    }


}
