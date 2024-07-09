package com.forohub.wilmer.forohubwilmer.services;

import com.forohub.wilmer.forohubwilmer.models.Topico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TopicoService {

    public List<Topico> listTopico();
    public Topico findByIdTopico(Long id);
    public void addTopico(Topico topico);
    public void updateTopico(Topico topico);
    public void deleteTopico(Long id);

}
