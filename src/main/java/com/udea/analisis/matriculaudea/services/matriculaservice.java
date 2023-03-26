package com.udea.analisis.matriculaudea.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.udea.analisis.matriculaudea.models.Matricula;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.IMatriculaService;

@Service
public class matriculaservice implements IMatriculaService {

    ArrayList<Matricula> matriculas;

    public matriculaservice() {
        matriculas = new ArrayList<Matricula>();

        Matricula matricula1 = new Matricula("000001", "123", "0124");
        Matricula matricula2 = new Matricula("000002", "123132", "0124");
        Matricula matricula3 = new Matricula("000003", "4324", "0124");

        matriculas.add(matricula1);
        matriculas.add(matricula2);
        matriculas.add(matricula3);
    }

    @Override
    public ArrayList<Matricula> findAllRegisters() {
        return matriculas;
    }

    @Override
    public Matricula getRegisterByID(String id) {
        return matriculas.get(0);
    }

    @Override
    public void insertRegister(Matricula matricula) {
        matriculas.add(matricula);
    }

    @Override
    public void finishRegister(String id) {
        //Reemplazar matriculas con el estado "Registrado", por Finalizado
    }

}
