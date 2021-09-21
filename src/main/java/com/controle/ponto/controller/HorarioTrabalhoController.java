package com.controle.ponto.controller;

import com.controle.ponto.model.HorarioTrabalho;
import com.controle.ponto.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/controle/ponto")
public class HorarioTrabalhoController {

    @Autowired
    private HorarioService horarioService;

    @PostMapping
    public HorarioTrabalho createHorario(@RequestBody HorarioTrabalho horarioTrabalho){
        return horarioService.save(horarioTrabalho);
    }

    @GetMapping
    public List<HorarioTrabalho> getHorarioList(){
        return horarioService.findAll();
    }

    @GetMapping("/{idHorario}")
    public ResponseEntity<HorarioTrabalho> getHorarioByID(@PathVariable("idHorario") Long idHorario) throws Exception{
        return ResponseEntity.ok(horarioService.getById(idHorario).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public HorarioTrabalho update (@RequestBody HorarioTrabalho horarioTrabalho){
        return horarioService.update(horarioTrabalho);
    }

    @DeleteMapping
    public ResponseEntity<HorarioTrabalho> deleteByID(@PathVariable("idHorario") Long idHorario) throws Exception {
        try {
            horarioService.delete(idHorario);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<HorarioTrabalho>) ResponseEntity.ok();
    }

}
