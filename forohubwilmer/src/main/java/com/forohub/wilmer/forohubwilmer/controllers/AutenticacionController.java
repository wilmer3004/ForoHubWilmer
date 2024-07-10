package com.forohub.wilmer.forohubwilmer.controllers;

import com.forohub.wilmer.forohubwilmer.Http.ResponseError;
import com.forohub.wilmer.forohubwilmer.dtos.DatosAutenticacionUsuario;
import com.forohub.wilmer.forohubwilmer.models.Usuario;
import com.forohub.wilmer.forohubwilmer.services.UsuarioService;
import com.forohub.wilmer.forohubwilmer.services.impl.UsuarioServiceImpl;
import com.forohub.wilmer.forohubwilmer.utils.security.DatosJWTToken;
import com.forohub.wilmer.forohubwilmer.utils.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    private final ResponseError responseError = new ResponseError();

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {
        if(!usuarioService.userExist(datosAutenticacionUsuario.correoElectronico(),datosAutenticacionUsuario.contrasena())){
            responseError.setError("Unauthorized");
            responseError.setStatus(403);
            responseError.setMessage("Error de credenciales");
            responseError.setPath("/login");
            return new ResponseEntity<>(responseError, HttpStatus.UNAUTHORIZED);
        }
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.correoElectronico(),
                datosAutenticacionUsuario.contrasena());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }

}
