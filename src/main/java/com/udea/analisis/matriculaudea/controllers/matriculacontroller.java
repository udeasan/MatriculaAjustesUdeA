package com.udea.analisis.matriculaudea.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.models.Matricula;
import com.udea.analisis.matriculaudea.models.Registro;
import com.udea.analisis.matriculaudea.models.Tanda;
import com.udea.analisis.matriculaudea.repositories.EstudianteRepository;
import com.udea.analisis.matriculaudea.repositories.MatriculasRepository;
import com.udea.analisis.matriculaudea.repositories.RegistrosRepository;
import com.udea.analisis.matriculaudea.repositories.TandaRepository;

@RestController
public class matriculacontroller {
    @Autowired
    EstudianteRepository estudianteRepository;
    @Autowired
    MatriculasRepository matriculasRepository;
    @Autowired
    RegistrosRepository registroRepository;
    @Autowired
    TandaRepository tandaRepository;

    @CrossOrigin
    @PostMapping(value = "/iniciarMatricula/{idEstudiante}")
    public HashMap<String, String> iniciarMatricula(@PathVariable String idEstudiante) {
        Estudiante findStudent = estudianteRepository.findByNumeroIdentificacion(idEstudiante);
        HashMap<String, String> jsonResponse = null;

        if (findStudent != null) {
            Tanda tanda = tandaRepository.findById(findStudent.TandaMatricula).orElse(null);
            if (tanda == null) {
                jsonResponse = new HashMap<String, String>();
                jsonResponse.put("status", "ERROR");
                jsonResponse.put("message", "No se encontro la tanda");

                return jsonResponse;
            } else {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    Date currentTime = calendar.getTime();
                    Date tandaDate = sdf.parse(tanda.dia + " " + tanda.horario);

                    if (currentTime.compareTo(tandaDate) < 0) {
                        jsonResponse = new HashMap<String, String>();
                        jsonResponse.put("status", "ERROR");
                        jsonResponse.put("message", "Aun no es horario de matricula para el estudiante, su tanda es "
                                + tanda.dia + " " + tanda.horario);
                        return jsonResponse;
                    }
                } catch (Exception e) {

                }
            }

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

            jsonResponse = new HashMap<String, String>();
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
    @GetMapping(value = "/GetCurrentTime")
    public HashMap<String, String> getCurrentTime() {
        HashMap<String, String> jsonError = new HashMap<String, String>();
        HashMap<String, String> jsonOK = new HashMap<String, String>();
        try {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            Date currentTime = calendar.getTime();
            jsonOK = new HashMap<String, String>();
            jsonOK.put("status", "OK");
            jsonOK.put("message", currentTime.toString());
            return jsonOK;
        } catch (Exception e) {
            jsonError = new HashMap<String, String>();
            jsonError.put("status", "ERROR");
            jsonError.put("message", e.getMessage());
            return jsonError;
        }
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
                    jsonError.put("message", "No se ha encontrado la matricula, verificar el dato envíado.");
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
            jsonError.put("message", "La matricula no se encuentra inicializada.");
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

    @CrossOrigin
    @GetMapping(value = "/consultarMatricula/{identificadorPeticion}")
    public HashMap<String, Object> consultarMatricula(@PathVariable String identificadorPeticion) {
        HashMap<String, Object> jsonError = new HashMap<String, Object>();
        HashMap<String, Object> jsonOK = new HashMap<String, Object>();
        Matricula matriculaEstudiante = null;

        if (identificadorPeticion != null && !identificadorPeticion.equals("")) {
            Optional<Matricula> findById = matriculasRepository.findById(identificadorPeticion);
            if (findById.isPresent()) {
                matriculaEstudiante = findById.get();
            } else {
                matriculaEstudiante = matriculasRepository.findByNumeroIdentificacionEstudiante(identificadorPeticion);
            }
        } else {
            jsonError.put("status", "ERROR");
            jsonError.put("message", "No se han enviado la matricula o el id del estudiante");
            return jsonError;
        }

        if(matriculaEstudiante == null) {
            jsonError.put("status", "ERROR");
            jsonError.put("message", "No se ha encontrado la matricula, verificar el dato envíado.");
            return jsonError;
        } else if (!matriculaEstudiante.estadoMatricula.equals("Matriculado")){
            jsonError.put("status", "ERROR");
            jsonError.put("message", "La matricula del estudiante aun no ha finalizado");
            return jsonError;
        }else {
            List<Registro> registros = registroRepository
                    .findRegistrosByCodigoMatricula(matriculaEstudiante.codigoMatricula);
            jsonOK.put("status", "OK");
            jsonOK.put("message", "Se han consultado los registros del estudiante");
            jsonOK.put("Registros", registros);
            return jsonOK;
        }
    }
}
