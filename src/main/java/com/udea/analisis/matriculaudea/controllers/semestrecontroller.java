package com.udea.analisis.matriculaudea.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Semestre;
import com.udea.analisis.matriculaudea.services.semesterservice;

@RestController
public class semestrecontroller {
    @Autowired
    private semesterservice servicioSemestre;
    
    @GetMapping("semestre/{id}")
    public Semestre getInfoSemester(@PathVariable String id){
        return servicioSemestre.getInfoSemester(id);
    }
}
