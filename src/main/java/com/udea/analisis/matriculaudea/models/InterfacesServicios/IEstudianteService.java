package com.udea.analisis.matriculaudea.models.InterfacesServicios;

import java.util.ArrayList;

import com.udea.analisis.matriculaudea.models.Estudiante;

public interface IEstudianteService {
    ArrayList<Estudiante> findAllStudents();

    Estudiante getStudentByID(String id);

    void insertStudent(Estudiante student);
}
