package com.udea.analisis.matriculaudea.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.udea.analisis.matriculaudea.models.Curso;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.ICursoService;

@Service
public class cursoservice implements ICursoService {

    ArrayList<Curso> courses = new ArrayList<Curso>();

    public cursoservice() {
        Curso analisisI = new Curso("1020001", "Análisis II", "MJ 20-22", "4", "20", "", "");
        Curso analisisII = new Curso("1020002", "Análisis II", "WV 20-22", "4", "20", "1020001", "");
        Curso basesDeDatos = new Curso("10200003", "Bases de Datos", "LWV 12-14", "4", "20", "", "");
        courses.add(analisisI);
        courses.add(analisisII);
        courses.add(basesDeDatos);
    }

    @Override
    public ArrayList<Curso> findAllCourses() {
        return courses;
    }

    @Override
    public ArrayList<Curso> getCoursesForStudent(String id) {
        //Filter courses for student
        ArrayList<Curso> listaTemporal = new ArrayList<Curso>();
        Curso analisisI = new Curso("1020001", "Análisis II", "MJ 20-22", "4", "20", "", "");
        Curso basesDeDatos = new Curso("10200003", "Bases de Datos", "LWV 12-14", "4", "20", "", "");
        listaTemporal.add(analisisI);
        listaTemporal.add(basesDeDatos);
        return listaTemporal;
    }

    @Override
    public void insertCourse(Curso course) {
        courses.add(course);
    }

}
