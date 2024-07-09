package com.forohub.wilmer.forohubwilmer.services;


import com.forohub.wilmer.forohubwilmer.models.Perfil;

import java.util.List;

public interface PerfilService {

    public List<Perfil> listPerfil();
    public Perfil findByIdPerfil(Long id);
    public void addPerfil(Perfil perfil);
    public void updatePerfil(Perfil perfil);
    public void deletePerfil(Long id);

}
