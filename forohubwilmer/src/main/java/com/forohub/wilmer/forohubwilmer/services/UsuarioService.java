package com.forohub.wilmer.forohubwilmer.services;

import com.forohub.wilmer.forohubwilmer.dtos.DatosUsuario;
import com.forohub.wilmer.forohubwilmer.models.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<DatosUsuario> listUsuario();
    public DatosUsuario findByIdUsuario(Long id);
    public void addUsuario(DatosUsuario datosUsuario);
    public void updateUsuario(DatosUsuario datosUsuario, Long id);
    public void deleteUsuario(Long id);

}
