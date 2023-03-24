package com.udea.analisis.matriculaudea.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.udea.analisis.matriculaudea.models.Curso;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.ICursoService;

@Service
public class cursoservice implements ICursoService {

    ArrayList<Curso> courses = new ArrayList<Curso>();

    Curso analisisI = new Curso("Análisis I", "MJ 20-22", "112233");
    Curso analisisII = new Curso("Análisis II", "WV 20-22", "121256");
    Curso basesDatos = new Curso("Bases de Datos", "MJ 20-22", "251425");


    @Override
    public ArrayList<Curso> findAllCourses() {
        courses.add(analisisI);
        courses.add(analisisII);
        courses.add(basesDatos);
        return courses;
    }

    @Override
    public Curso getCourseByID(String id) {
        Curso myCourse = new Curso();
        for (Curso estudiante : courses) {
            if (estudiante.Codigo.equals(id)) {
                myCourse.Nombre = estudiante.Nombre;
                myCourse.Codigo = estudiante.Codigo;
            }
        }
        return myCourse;
    }

    @Override
    public void insertCourse(Curso course) {
        courses.add(course);
    }
    
}
