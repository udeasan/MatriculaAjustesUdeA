package com.udea.analisis.matriculaudea.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.repositories.EstudianteRepository;

@RestController
public class estudiantecontroller {
    @Autowired
    EstudianteRepository estudianteRepository;

    @CrossOrigin
    @GetMapping(value = "/estudiantes")
    public List<Estudiante> getAllstudents() {
        return estudianteRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/estudiantes/{id}")
    public Estudiante getStudentByID(@PathVariable String id){
        return estudianteRepository.findByNumeroIdentificacion(id);
    }

}
