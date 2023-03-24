package com.udea.analisis.matriculaudea.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.IEstudianteService;

@RestController
public class estudiantecontroller {
    @Autowired
    private IEstudianteService servicioEstudiante;

    @GetMapping(value = "/estudiantes")
    public ArrayList<Estudiante> getAllstudents() {
        ArrayList<Estudiante> students = servicioEstudiante.findAllStudents();
        return students;
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
