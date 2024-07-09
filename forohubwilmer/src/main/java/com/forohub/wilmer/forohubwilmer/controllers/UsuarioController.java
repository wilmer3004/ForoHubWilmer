package com.forohub.wilmer.forohubwilmer.controllers;

import com.forohub.wilmer.forohubwilmer.dtos.DatosUsuario;
import com.forohub.wilmer.forohubwilmer.services.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {


    //Inyeccion de dependencia
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @GetMapping("/all")
    public ResponseEntity all(){
        return null;
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody DatosUsuario datosUsuario){
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody DatosUsuario datosUsuario, @PathVariable Long id){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return null;
    }

}
