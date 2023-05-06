package com.udea.analisis.matriculaudea.controllers;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.udea.analisis.matriculaudea.models.Horario;
import com.udea.analisis.matriculaudea.models.Matricula;
import com.udea.analisis.matriculaudea.models.Registro;
import com.udea.analisis.matriculaudea.models.RegistroBody;
import com.udea.analisis.matriculaudea.repositories.HorarioRepository;
import com.udea.analisis.matriculaudea.repositories.MatriculasRepository;
import com.udea.analisis.matriculaudea.repositories.RegistrosRepository;

@RestController
public class registercontroller {
    @Autowired
    RegistrosRepository registroRepository;
    @Autowired
    MatriculasRepository matriculasRepository;
    @Autowired
    HorarioRepository horarioRepository;

    @ResponseBody
    @CrossOrigin
    @PostMapping(value = "/registrarCurso")
    public HashMap<String, String> registrarCurso(
            @RequestBody RegistroBody registroData) {
        HashMap<String, String> jsonError = new HashMap<String, String>();
        HashMap<String, String> jsonOK = new HashMap<String, String>();
        Matricula matriculaEstudiante = null;

        if (registroData.codigoMatricula != null && !registroData.codigoMatricula.equals("")) {
            Optional<Matricula> findMatricula = matriculasRepository.findById(registroData.codigoMatricula);
            if (findMatricula.isPresent()) {
                matriculaEstudiante = findMatricula.get();
            }
        } else if (registroData.idEstudiante != null && !registroData.idEstudiante.equals("")) {
            matriculaEstudiante = matriculasRepository.findByNumeroIdentificacionEstudiante(registroData.idEstudiante);
        } else {
            jsonError.put("status", "ERROR");
            jsonError.put("message", "Error: No se han enviado el código de matricula o información del estudiante");
            return jsonError;
        }

        if (matriculaEstudiante == null) {
            jsonError.put("status", "ERROR");
            jsonError.put("message", "Error: No se encontro el registro de matricula ");
            return jsonError;
        } else {
            if (matriculaEstudiante.estadoMatricula.toUpperCase().equals("INICIADA")) {
                Horario horarioCurso = horarioRepository.findByCodigo(registroData.codigoHorario);
                if (horarioCurso == null) {
                    jsonError.put("status", "ERROR");
                    jsonError.put("message", "No se encontro el curso solicitado");
                    return jsonError;
                } else if (horarioCurso.cuposDisponibles <= 0) {
                    jsonError.put("status", "ERROR");
                    jsonError.put("message", "No hay cupos disponibles para el curso");
                    return jsonError;
                } else {
                    int randomInt = (int) ((Math.random() * (1000 - 1)) + 1);
                    Registro registroMatricula = new Registro();
                    registroMatricula.codigoHorario = registroData.codigoHorario;
                    registroMatricula.codigoMateria = horarioCurso.idCurso;
                    registroMatricula.codigoMatricula = matriculaEstudiante.codigoMatricula;
                    registroMatricula.numeroIdentificacionEstudiante = matriculaEstudiante.numeroIdentificacionEstudiante;
                    registroMatricula.estadoRegistro = "Inicial";
                    registroMatricula.idRegistro = String.valueOf(randomInt) + matriculaEstudiante.codigoMatricula;
                    registroRepository.save(registroMatricula);

                    jsonOK.put("status", "OK");
                    jsonOK.put("message", "Se ha creado el registro de horario correctamente");
                    return jsonOK;
                }

            } else {
                jsonError.put("status", "ERROR");
                jsonError.put("message", "La matricula no se encuentra activa");
                return jsonError;
            }
        }
    }
}
