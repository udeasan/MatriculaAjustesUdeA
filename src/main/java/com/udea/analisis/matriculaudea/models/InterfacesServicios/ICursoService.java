package com.udea.analisis.matriculaudea.models.InterfacesServicios;

import java.util.ArrayList;

import com.udea.analisis.matriculaudea.models.Curso;

public interface ICursoService {

    ArrayList<Curso> findAllCourses();

    Curso getCourseByID(String id);

    void insertCourse(Curso student);
}
