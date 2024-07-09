package com.forohub.wilmer.forohubwilmer.services;


import com.forohub.wilmer.forohubwilmer.dtos.DatosPerfil;

import java.util.List;

public interface PerfilService {

    public List<DatosPerfil> listPerfil();
    public DatosPerfil findByIdPerfil(Long id);
    public void addPerfil(DatosPerfil datosPerfil);
    public void updatePerfil(DatosPerfil datosPerfil, Long id);
    public void deletePerfil(Long id);

}
