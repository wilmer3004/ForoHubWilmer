package com.forohub.wilmer.forohubwilmer.controllers;

import com.forohub.wilmer.forohubwilmer.dtos.DatosTopico;
import com.forohub.wilmer.forohubwilmer.services.impl.CursoServiceImpl;
import com.forohub.wilmer.forohubwilmer.services.impl.TopicoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/topico")
public class TopicoController {


    //Inyeccion de dependencia
    @Autowired
    private TopicoServiceImpl topicoServiceImpl;

    @GetMapping("/all")
    public ResponseEntity all(){
        return null;
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody DatosTopico datosTopico){
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody DatosTopico datosTopico, @PathVariable Long id){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return null;
    }

}
