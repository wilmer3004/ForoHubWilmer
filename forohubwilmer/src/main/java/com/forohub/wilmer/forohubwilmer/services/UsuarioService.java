package com.forohub.wilmer.forohubwilmer.services;

import com.forohub.wilmer.forohubwilmer.models.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> listUsuario();
    public Usuario findByIdUsuario(Long id);
    public void addUsuario(Usuario usuario);
    public void updateUsuario(Usuario usuario);
    public void deleteUsuario(Long id);

}
