package com.udea.analisis.matriculaudea.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Curso;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.ICursoService;

@RestController
public class cursocontroller {
    @Autowired
    private ICursoService cursoService;

    @GetMapping(value = "/cursos")
    public ArrayList<Curso> getAllstudents() {
        
        ArrayList<Curso> courses = cursoService.findAllCourses();
        return courses;
    }

    @GetMapping("/cursos/{id}")
    public Curso getStudentByID(@PathVariable String id){
        Curso myCourse = cursoService.getCourseByID(id);
        return myCourse;
    }

    @PostMapping("/cursos")
    public void postStudent(@RequestBody Curso student)
    {
        cursoService.insertCourse(student);
    }

}
