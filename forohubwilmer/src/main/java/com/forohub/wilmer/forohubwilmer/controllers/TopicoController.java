package com.forohub.wilmer.forohubwilmer.controllers;

import com.forohub.wilmer.forohubwilmer.Http.ResponseError;
import com.forohub.wilmer.forohubwilmer.Http.ResponseGet;
import com.forohub.wilmer.forohubwilmer.dtos.DatosTopico;
import com.forohub.wilmer.forohubwilmer.services.impl.CursoServiceImpl;
import com.forohub.wilmer.forohubwilmer.services.impl.TopicoServiceImpl;
import com.forohub.wilmer.forohubwilmer.utils.errors.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/topico")
public class TopicoController {


    //Inyeccion de dependencia
    @Autowired
    private TopicoServiceImpl topicoServiceImpl;

    @GetMapping("/all")
    public ResponseEntity all(){
        ResponseGet responseGet = new ResponseGet();

        if (!topicoServiceImpl.listTopico().isEmpty()){
            responseGet.setData(topicoServiceImpl.listTopico());
            responseGet.setMessage("Success full topico");
            responseGet.setStatus(200);
        }else {
            responseGet.setData(topicoServiceImpl.listTopico());
            responseGet.setMessage("NotFound topico");
            responseGet.setStatus(200);
        }
        return new ResponseEntity<>(responseGet, HttpStatusCode.valueOf(responseGet.getStatus()));
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        ResponseGet responseGet = new ResponseGet();
        List<DatosTopico>datosTopicoList = new ArrayList<>();
        if (topicoServiceImpl.findByIdTopico(id) != null){
            datosTopicoList.add(topicoServiceImpl.findByIdTopico(id));
            responseGet.setData(datosTopicoList);
            responseGet.setMessage("Success full topico");
            responseGet.setStatus(200);
        }else {
            responseGet.setData(datosTopicoList);
            responseGet.setMessage("NotFound topico");
            responseGet.setStatus(200);
        }
        return new ResponseEntity<>(responseGet, HttpStatusCode.valueOf(responseGet.getStatus()));
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody DatosTopico datosTopico){
        try {
            topicoServiceImpl.addTopico(datosTopico);
            return new ResponseEntity<>("", HttpStatus.CREATED);

        }catch (Exception e){
            ResponseError responseError = new ResponseError();
            responseError.setError(e.getMessage());
            responseError.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseError.setMessage(e.getMessage());
            responseError.setPath("/error");
            return new ResponseEntity<>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody DatosTopico datosTopico, @PathVariable Long id){
        try {
            topicoServiceImpl.updateTopico(datosTopico,id);
            return new ResponseEntity<>("", HttpStatus.NO_CONTENT);

        }catch (Exception e){
            ResponseError responseError = new ResponseError();
            responseError.setError(e.getMessage());
            responseError.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseError.setMessage(e.getMessage());
            responseError.setPath("/error");
            return new ResponseEntity<>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        try {
            topicoServiceImpl.deleteTopico(id);
            return new ResponseEntity<>("", HttpStatus.NO_CONTENT);

        }catch (Exception e){
            ResponseError responseError = new ResponseError();
            responseError.setError(e.getMessage());
            responseError.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseError.setMessage(e.getMessage());
            responseError.setPath("/error");
            return new ResponseEntity<>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
