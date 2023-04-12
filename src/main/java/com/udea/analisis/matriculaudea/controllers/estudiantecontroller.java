package com.udea.analisis.matriculaudea.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.repositories.EstudianteRepository;
import com.udea.analisis.matriculaudea.services.estudianteservice;

@RestController
public class estudiantecontroller {
    @Autowired
    private estudianteservice servicioEstudiante;

    @Autowired
    EstudianteRepository estudianteRepository;

    @GetMapping(value = "/estudiantes")
    public List<Estudiante> getAllstudents() {
        return estudianteRepository.findAll();
    }

    @GetMapping("/estudiantes/{id}")
    public Estudiante getStudentByID(@PathVariable String id){
        Estudiante myStudent = servicioEstudiante.getStudentByID(id);
        return myStudent;
    }

    @PostMapping("/estudiantes")
    public void postStudent(@RequestBody Estudiante student)
    {
        servicioEstudiante.insertStudent(student);
    }

}
