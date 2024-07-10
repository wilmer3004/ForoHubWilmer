package com.forohub.wilmer.forohubwilmer.services.impl;

import com.forohub.wilmer.forohubwilmer.dtos.DatosTopico;
import com.forohub.wilmer.forohubwilmer.models.Curso;
import com.forohub.wilmer.forohubwilmer.models.Topico;
import com.forohub.wilmer.forohubwilmer.models.Usuario;
import com.forohub.wilmer.forohubwilmer.repositories.CursoRepository;
import com.forohub.wilmer.forohubwilmer.repositories.TopicoRepository;
import com.forohub.wilmer.forohubwilmer.repositories.UsuarioRepository;
import com.forohub.wilmer.forohubwilmer.services.TopicoService;
import com.forohub.wilmer.forohubwilmer.utils.errors.CustomException;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicoServiceImpl implements TopicoService {

    //Inyeccion de dependencia
    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<DatosTopico> listTopico() {

        List<Topico> topicoList = topicoRepository.findAll();
        List<DatosTopico> datosTopicoList = new ArrayList<>();

        topicoList.forEach(topico -> datosTopicoList.add(modelMapper.map(topico, DatosTopico.class)));


        return datosTopicoList;
    }

    @Override
    public DatosTopico findByIdTopico(Long id) {
        return modelMapper.map(topicoRepository.findById(id), DatosTopico.class);
    }

    @Override
    public void addTopico(DatosTopico datosTopico) {
        Topico topico = new Topico();
        topico.setStatus(datosTopico.getStatus());
        topico.setMensaje(datosTopico.getMensaje());
        topico.setTitulo(datosTopico.getTitulo());
        topico.setFechaCreacion(datosTopico.getFechaCreacion());
        try {
            Usuario usuario = usuarioRepository.getById(datosTopico.getIdAutorFK());
            System.out.println(usuario);
            Curso curso = cursoRepository.getById(datosTopico.getIdCursoFK());
            System.out.println(curso);
            topico.setIdAutorFK(usuario);
            topico.setIdCursoFK(curso);
            topicoRepository.save(topico);
        }catch (EntityNotFoundException ent){
            throw new CustomException("Not found relation data");
        }
        catch (Exception e){
            System.err.println(e.getMessage());
            throw new CustomException(e.getMessage());
        }
    }

    @Override
    public void updateTopico(DatosTopico datosTopico, Long id) {
        Optional<Topico> optionalTopico = topicoRepository.findById(id);
        if (optionalTopico.isPresent()) {
            Topico topico = optionalTopico.get();
            topico.setStatus(datosTopico.getStatus());
            topico.setMensaje(datosTopico.getMensaje());
            topico.setTitulo(datosTopico.getTitulo());
            topico.setFechaCreacion(datosTopico.getFechaCreacion());
            try {
                Usuario usuario = usuarioRepository.getById(datosTopico.getIdAutorFK());
                System.out.println(usuario);
                Curso curso = cursoRepository.getById(datosTopico.getIdCursoFK());
                System.out.println(curso);
                topico.setIdAutorFK(usuario);
                topico.setIdCursoFK(curso);
                topicoRepository.save(topico);
            } catch (EntityNotFoundException ent) {
                throw new CustomException("Not found relation data");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                throw new CustomException(e.getMessage());
            }
        }else {
            throw new EntityNotFoundException("Topico not found");
        }
    }
    @Override
    public void deleteTopico(Long id) {
        Optional<Topico> optionalTopico = topicoRepository.findById(id);
        System.out.println(optionalTopico);
        if (optionalTopico.isPresent()) {
            try {
                topicoRepository.deleteById(id);
            } catch (Exception e) {
                throw new CustomException("Error de servidor");
            }
        } else {
            throw new EntityNotFoundException("Topico not found");
        }
    }
}
