package com.controle.ponto.service;

import com.controle.ponto.model.HorarioTrabalho;
import com.controle.ponto.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorarioService {

    @Autowired
    HorarioRepository horarioRepository;

    public HorarioTrabalho save(HorarioTrabalho horarioTrabalho){
        return horarioRepository.save(horarioTrabalho);
    }

    public List<HorarioTrabalho> findAll() {
        return horarioRepository.findAll();
    }

    public Optional<HorarioTrabalho> getById(Long idHorario) {
        return horarioRepository.findById(idHorario);
    }

    public HorarioTrabalho update(HorarioTrabalho horarioTrabalho){
        return horarioRepository.save(horarioTrabalho);
    }

    public void delete(Long idHorario) {
        horarioRepository.deleteById(idHorario);
    }
}
