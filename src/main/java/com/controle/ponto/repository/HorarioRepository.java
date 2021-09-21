package com.controle.ponto.repository;

import com.controle.ponto.model.HorarioTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository <HorarioTrabalho, Long> {
}
