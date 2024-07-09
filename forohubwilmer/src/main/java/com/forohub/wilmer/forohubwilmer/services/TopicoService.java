package com.forohub.wilmer.forohubwilmer.services;

import com.forohub.wilmer.forohubwilmer.models.Topico;

import java.util.List;

public interface TopicoService {

    public List<Topico> listTopico();
    public Topico findByIdTopico(Long id);
    public void addTopico(Topico topico);
    public void updateTopico(Topico topico);
    public void deleteTopico(Long id);

}
