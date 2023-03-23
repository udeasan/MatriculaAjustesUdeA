package com.udea.analisis.matriculaudea.models;

import java.util.ArrayList;

public interface IEstudianteService {
    ArrayList<Estudiante> findAllStudents();

    Estudiante getStudentByID(String id);
}
