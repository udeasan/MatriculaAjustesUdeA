package com.udea.analisis.matriculaudea.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Curso;
import com.udea.analisis.matriculaudea.repositories.CursosRepository;
import com.udea.analisis.matriculaudea.services.cursoservice;

@RestController
public class cursocontroller {
    @Autowired
    private cursoservice cursoService;

    @Autowired
    CursosRepository cursosRepository;

    @GetMapping(value = "/cursos/{idCarrera}")
    public List<Curso> getAllcourses(@PathVariable String idCarrera) {
        return cursosRepository.findAll();
    }

    @GetMapping("/cursos/estudiante/{idStudent}")
    public List<Curso> getCourseByID(@PathVariable String idStudent){
        return cursosRepository.findByNivel(1);
    }

    @PostMapping("/cursos")
    public void postStudent(@RequestBody Curso student)
    {
        cursoService.insertCourse(student);
    }

}
