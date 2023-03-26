package com.udea.analisis.matriculaudea.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Curso;
import com.udea.analisis.matriculaudea.services.cursoservice;

@RestController
public class cursocontroller {
    @Autowired
    private cursoservice cursoService;

    @GetMapping(value = "/cursos")
    public ArrayList<Curso> getAllcourses() {
        
        ArrayList<Curso> courses = cursoService.findAllCourses();
        return courses;
    }

    @GetMapping("/cursos/{id}")
    public ArrayList<Curso> getCourseByID(@PathVariable String id){
        ArrayList<Curso> myCourse = cursoService.getCoursesForStudent(id);
        return myCourse;
    }

    @PostMapping("/cursos")
    public void postStudent(@RequestBody Curso student)
    {
        cursoService.insertCourse(student);
    }

}
