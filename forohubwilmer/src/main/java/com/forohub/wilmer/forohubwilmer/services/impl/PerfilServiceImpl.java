package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosCurso;
import com.forohub.wilmer.forohubwilmer.dtos.DatosPerfil;
import com.forohub.wilmer.forohubwilmer.models.Curso;
import com.forohub.wilmer.forohubwilmer.models.Perfil;
import com.forohub.wilmer.forohubwilmer.repositories.PerfilRepository;
import com.forohub.wilmer.forohubwilmer.services.PerfilService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService {

    //Inyeccion de dependencia
    @Autowired
    private PerfilRepository perfilRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<DatosPerfil> listPerfil() {
        List<Perfil> perfilList = perfilRepository.findAll();
        List<DatosPerfil> datosPerfil = new ArrayList<>();

        perfilList.forEach(perfil -> datosPerfil.add(modelMapper.map(perfil, DatosPerfil.class)));

        return datosPerfil;
    }

    @Override
    public DatosPerfil findByIdPerfil(Long id) {
        return modelMapper.map(perfilRepository.findById(id), DatosPerfil.class);
    }

    @Override
    public void addPerfil(DatosPerfil datosPerfil) {
        perfilRepository.save(modelMapper.map(datosPerfil, Perfil.class));
    }

    @Override
    public void updatePerfil(DatosPerfil datosPerfil, Long id) {
        Perfil perfil = modelMapper.map(datosPerfil, Perfil.class);
        perfil.setId(id);
        perfilRepository.save(perfil);
    }

    @Override
    public void deletePerfil(Long id) {
        perfilRepository.deleteById(id);
    }
}
