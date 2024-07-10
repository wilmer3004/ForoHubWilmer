package com.forohub.wilmer.forohubwilmer.controllers;

import com.forohub.wilmer.forohubwilmer.Http.ResponseGet;
import com.forohub.wilmer.forohubwilmer.dtos.DatosCurso;
import com.forohub.wilmer.forohubwilmer.services.impl.CursoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/curso")
public class CursoController {

    //Inyeccion de dependencia
    @Autowired
    private CursoServiceImpl cursoServiceImpl;

    @GetMapping("/all")
    public ResponseEntity all(){
        ResponseGet responseGet = new ResponseGet();

        if (!cursoServiceImpl.listCurso().isEmpty()){
            responseGet.setData(cursoServiceImpl.listCurso());
            responseGet.setMessage("Success full");
            responseGet.setStatus(200);
        }else {
            responseGet.setData(cursoServiceImpl.listCurso());
            responseGet.setMessage("NotFound");
            responseGet.setStatus(200);
        }
        return ResponseEntity.ok(responseGet);
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody DatosCurso datosCurso){
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody DatosCurso datosCurso, @PathVariable Long id){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return null;
    }



}
