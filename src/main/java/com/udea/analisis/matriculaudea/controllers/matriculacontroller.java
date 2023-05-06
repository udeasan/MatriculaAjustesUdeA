package com.udea.analisis.matriculaudea.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.models.Matricula;
import com.udea.analisis.matriculaudea.repositories.EstudianteRepository;
import com.udea.analisis.matriculaudea.repositories.MatriculasRepository;

@RestController
public class matriculacontroller {
    @Autowired
    EstudianteRepository estudianteRepository;
    @Autowired
    MatriculasRepository matriculasRepository;

    @CrossOrigin
    @PostMapping(value = "/iniciarMatricula/{idEstudiante}")
    public Object iniciarMatricula(@PathVariable String idEstudiante) {
        Estudiante findStudent = estudianteRepository.findByNumeroIdentificacion(idEstudiante);

        if (findStudent != null) {
            Matricula checkMatricula = matriculasRepository.findByNumeroIdentificacionEstudiante(idEstudiante);
            if (checkMatricula == null) {
                int randomInt = (int) ((Math.random() * (1000 - 1)) + 1);
                checkMatricula = new Matricula(
                        String.valueOf(randomInt) + idEstudiante,
                        idEstudiante,
                        "2023-01",
                        "Iniciada");

                matriculasRepository.save(checkMatricula);
            }

            HashMap<String,String> jsonResponse = new HashMap<String,String>();
            jsonResponse.put("status", "OK"); 
            jsonResponse.put("estadoMatricula", "INICIADA"); 
            jsonResponse.put("codigoMatricula", checkMatricula.codigoMatricula); 
            jsonResponse.put("identificacionEstudiante", checkMatricula.numeroIdentificacionEstudiante); 
            
            return jsonResponse;
        }

        HashMap<String,String> jsonError = new HashMap<String,String>();
        jsonError.put("status", "ERROR");
        jsonError.put("message", "Ocurrio un error al iniciar la amtricula del estudiante " + idEstudiante);

        return jsonError;
    }
}
