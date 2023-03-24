package com.udea.analisis.matriculaudea.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.models.Matricula;
import com.udea.analisis.matriculaudea.models.Semestre;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.IMatriculaService;

@Service
public class matriculaservice implements IMatriculaService{

    ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

    Semestre semestreActual = new Semestre("2023", "01", null);
    ArrayList<String> materias1 = new ArrayList<String>(Arrays.asList("123", "321", "222"));
    Estudiante pedro = new Estudiante("123", "CC", "Pedro", "Lopez", "pedro@gmail.com", "NORMAL");
    
    Matricula matricula1 = new Matricula(semestreActual, materias1, pedro);

    @Override
    public ArrayList<Matricula> findAllRegisters() {
        matriculas.add(matricula1);
        return matriculas;
    }

    @Override
    public Matricula getRegisterByID(String id) {
        return matricula1;
    }

    @Override
    public void insertRegister(Matricula matricula) {
        matriculas.add(matricula);
    }
    
}
