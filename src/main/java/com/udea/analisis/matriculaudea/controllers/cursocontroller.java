package com.udea.analisis.matriculaudea.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Curso;
import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.repositories.CursosRepository;
import com.udea.analisis.matriculaudea.repositories.EstudianteRepository;

@RestController
public class cursocontroller {

    @Autowired
    CursosRepository cursosRepository;

    @Autowired
    EstudianteRepository estudiantesRepository;

    @CrossOrigin
    @GetMapping(value = "/cursos/{idCarrera}")
    public List<Curso> getAllcourses(@PathVariable String idCarrera) {
        return cursosRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/cursos/estudiante/{idStudent}")
    public List<Curso> getCourseByID(@PathVariable String idStudent){
        Estudiante estudiante = estudiantesRepository.findByNumeroIdentificacion(idStudent);
        if(estudiante != null && estudiante.semestreAcademico != null){
            return cursosRepository.findByNivel(estudiante.semestreAcademico);
        }
        else {
            return List.of();
        }
        
    }

}
