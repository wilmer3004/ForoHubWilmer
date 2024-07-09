package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosPerfil;
import com.forohub.wilmer.forohubwilmer.models.Perfil;
import com.forohub.wilmer.forohubwilmer.repositories.PerfilRepository;
import com.forohub.wilmer.forohubwilmer.services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService {

    //Inyeccion de dependencia
    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public List<DatosPerfil> listPerfil() {
        return List.of();
    }

    @Override
    public DatosPerfil findByIdPerfil(Long id) {
        return null;
    }

    @Override
    public void addPerfil(DatosPerfil datosPerfil) {

    }

    @Override
    public void updatePerfil(DatosPerfil datosPerfil, Long id) {

    }

    @Override
    public void deletePerfil(Long id) {

    }
}
