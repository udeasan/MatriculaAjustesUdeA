package com.udea.analisis.matriculaudea.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.models.Matricula;
import com.udea.analisis.matriculaudea.models.Registro;
import com.udea.analisis.matriculaudea.repositories.EstudianteRepository;
import com.udea.analisis.matriculaudea.repositories.MatriculasRepository;
import com.udea.analisis.matriculaudea.repositories.RegistrosRepository;

@RestController
public class matriculacontroller {
    @Autowired
    EstudianteRepository estudianteRepository;
    @Autowired
    MatriculasRepository matriculasRepository;
    @Autowired
    RegistrosRepository registroRepository;

    @CrossOrigin
    @PostMapping(value = "/iniciarMatricula/{idEstudiante}")
    public HashMap<String, String> iniciarMatricula(@PathVariable String idEstudiante) {
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

            HashMap<String, String> jsonResponse = new HashMap<String, String>();
            jsonResponse.put("status", "OK");
            jsonResponse.put("estadoMatricula", "INICIADA");
            jsonResponse.put("codigoMatricula", checkMatricula.codigoMatricula);
            jsonResponse.put("identificacionEstudiante", checkMatricula.numeroIdentificacionEstudiante);

            return jsonResponse;
        }

        HashMap<String, String> jsonError = new HashMap<String, String>();
        jsonError.put("status", "ERROR");
        jsonError.put("message", "Ocurrio un error al iniciar la matricula del estudiante " + idEstudiante);

        return jsonError;
    }

    @CrossOrigin
    @PostMapping(value = "/finalizarMatricula/{identificadorPeticion}")
    public HashMap<String, String> finalizarMatricula(@PathVariable String identificadorPeticion) {

        HashMap<String, String> jsonError = new HashMap<String, String>();
        HashMap<String, String> jsonOK = new HashMap<String, String>();
        Matricula matriculaEstudiante = null;

        if (identificadorPeticion != null && !identificadorPeticion.equals("")) {
            Optional<Matricula> findById = matriculasRepository.findById(identificadorPeticion);
            if (findById.isPresent()) {
                matriculaEstudiante = findById.get();
            } else {
                matriculaEstudiante = matriculasRepository.findByNumeroIdentificacionEstudiante(identificadorPeticion);
                if (matriculaEstudiante == null) {
                    jsonError.put("status", "ERROR");
                    jsonError.put("message", "Error: No se ha encontrado la matricula, verificar el dato envíado.");
                    return jsonError;
                }
            }
        } else {
            jsonError.put("status", "ERROR");
            jsonError.put("message", "Error: No se han enviado la matricula o el id del estudiante");
            return jsonError;
        }

        if (matriculaEstudiante == null || !matriculaEstudiante.estadoMatricula.toUpperCase().equals("INICIADA")) {
            jsonError.put("status", "ERROR");
            jsonError.put("message", "Error: La matricula no se encuentra inicializada");
            return jsonError;
        } else {
            List<Registro> registros = registroRepository
                    .findRegistrosByCodigoMatricula(matriculaEstudiante.codigoMatricula);
            for (Registro registro : registros) {
                registro.estadoRegistro = "Matriculado";
                registroRepository.save(registro);
            }
            matriculaEstudiante.estadoMatricula = "Matriculado";
            matriculasRepository.save(matriculaEstudiante);

            jsonOK.put("status", "OK");
            jsonOK.put("message", "Se ha finalizado la matricula correctamente");
            return jsonOK;
        }
    }
}
