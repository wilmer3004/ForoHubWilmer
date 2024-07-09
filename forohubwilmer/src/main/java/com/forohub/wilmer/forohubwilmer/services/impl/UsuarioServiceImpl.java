package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosUsuario;
import com.forohub.wilmer.forohubwilmer.models.Usuario;
import com.forohub.wilmer.forohubwilmer.repositories.UsuarioRepository;
import com.forohub.wilmer.forohubwilmer.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    //Inyeccion de dependencia
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<DatosUsuario> listUsuario() {
        return List.of();
    }

    @Override
    public DatosUsuario findByIdUsuario(Long id) {
        return null;
    }

    @Override
    public void addUsuario(DatosUsuario datosUsuario) {

    }

    @Override
    public void updateUsuario(DatosUsuario datosUsuario, Long id) {

    }

    @Override
    public void deleteUsuario(Long id) {

    }
}
