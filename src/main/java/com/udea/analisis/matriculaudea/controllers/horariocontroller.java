package com.udea.analisis.matriculaudea.controllers;
import com.udea.analisis.matriculaudea.models.Horario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.repositories.HorarioRepository;

@RestController
public class horariocontroller {
    @Autowired
    HorarioRepository horarioRepository;

    @CrossOrigin
    @GetMapping(value = "/horarios/{IdCurso}")
    public List<Horario> getAllHorarios(@PathVariable String IdCurso){
        return horarioRepository.findByIdCurso(IdCurso);
    }
}
