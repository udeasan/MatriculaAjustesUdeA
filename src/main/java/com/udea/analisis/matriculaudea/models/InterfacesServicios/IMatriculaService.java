package com.udea.analisis.matriculaudea.models.InterfacesServicios;

import java.util.ArrayList;

import com.udea.analisis.matriculaudea.models.Matricula;

public interface IMatriculaService {
    ArrayList<Matricula> findAllRegisters();

    Matricula getRegisterByID(String id);

    void insertRegister(Matricula matricula);
}
