package com.forohub.wilmer.forohubwilmer.controllers;

import com.forohub.wilmer.forohubwilmer.dtos.DatosPerfil;
import com.forohub.wilmer.forohubwilmer.services.impl.PerfilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/perfil")
public class PerfilController {


    //Inyeccion de dependencia
    @Autowired
    private PerfilServiceImpl perfilServiceImpl;

    @GetMapping("/all")
    public ResponseEntity all(){
        return null;
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody DatosPerfil datosPerfil){
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody DatosPerfil datosPerfil, @PathVariable Long id){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return null;
    }

}
