package com.udea.analisis.matriculaudea.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Registro;
import com.udea.analisis.matriculaudea.models.ConsumerModels.RegistroInput;
import com.udea.analisis.matriculaudea.services.RegisterService;

@RestController
public class registercontroller {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/registro")
    public Registro registrarMateria(@RequestBody RegistroInput registroInput) {
        return registerService.addRegister(registroInput);
    }

    @GetMapping("/registro")
    public ArrayList<Registro> getAllRegisters() {
        return registerService.getAllRegisters();
    }

}
