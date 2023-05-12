package com.udea.analisis.matriculaudea.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class homecontroller {

    @RequestMapping("/")

    public String index() {
        return "Este es el servicio API REST para matriculas de la UdeA! - Para el proyecto fabrica Ing. de Sistemas 2023-01 :)";
    }

}
