package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosCurso;
import com.forohub.wilmer.forohubwilmer.dtos.DatosUsuario;
import com.forohub.wilmer.forohubwilmer.models.Curso;
import com.forohub.wilmer.forohubwilmer.models.Usuario;
import com.forohub.wilmer.forohubwilmer.repositories.UsuarioRepository;
import com.forohub.wilmer.forohubwilmer.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    //Inyeccion de dependencia
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<DatosUsuario> listUsuario() {
        List<Usuario> usuarioList = usuarioRepository.findAll();
        List<DatosUsuario> datosUsuarios = new ArrayList<>();

        usuarioList.forEach(usuario -> datosUsuarios.add(modelMapper.map(usuario, DatosUsuario.class)));

        return datosUsuarios;    }

    @Override
    public DatosUsuario findByIdUsuario(Long id) {
        return modelMapper.map(usuarioRepository.findById(id), DatosUsuario.class);
    }

    @Override
    public void addUsuario(DatosUsuario datosUsuario) {
        usuarioRepository.save(modelMapper.map(datosUsuario, Usuario.class));
    }

    @Override
    public void updateUsuario(DatosUsuario datosUsuario, Long id) {
        Usuario usuario = modelMapper.map(datosUsuario, Usuario.class);
        usuario.setId(id);

        usuarioRepository.save(usuario);

    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public boolean userExist(String correoElectronico, String contrasena){
        Usuario usuario = usuarioRepository.findByCorreoElectronico2(correoElectronico);
        if (usuario != null && passwordEncoder.matches(contrasena, usuario.getContrasena())) {
            return true;
        }
        return false;
    }
}
