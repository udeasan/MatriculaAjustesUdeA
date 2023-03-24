package com.udea.analisis.matriculaudea.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Matricula;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.IMatriculaService;

@RestController
public class matriculacontroller {
    @Autowired
    private IMatriculaService servicioMatricula;

    @GetMapping(value = "/matriculas")
    public ArrayList<Matricula> getAllRegisters() {
        ArrayList<Matricula> registers = servicioMatricula.findAllRegisters();
        return registers;
    }

    @GetMapping("/matriculas/{id}")
    public Matricula getStudentByID(@PathVariable String id){
        Matricula myRegister = servicioMatricula.getRegisterByID(id);
        return myRegister;
    }

    @PostMapping("/matriculas")
    public void postStudent(@RequestBody Matricula register)
    {
        servicioMatricula.insertRegister(register);
    }

}
