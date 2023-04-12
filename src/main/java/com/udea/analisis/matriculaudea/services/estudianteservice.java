package com.udea.analisis.matriculaudea.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.IEstudianteService;

@Service
public class estudianteservice implements IEstudianteService {
    ArrayList<Estudiante> students;

    public estudianteservice() {
        students = new ArrayList<Estudiante>();
    }

    @Override
    public ArrayList<Estudiante> findAllStudents() {
        return students;
    }

    @Override
    public Estudiante getStudentByID(String id) {
        Estudiante myStudent = new Estudiante();
        for (Estudiante estudiante : students) {
            if (estudiante.numeroIdentificacion.equals(id)) {
                myStudent.nombre = estudiante.nombre;
                myStudent.numeroIdentificacion = estudiante.numeroIdentificacion;
            }
        }
        return myStudent;
    }

    @Override
    public void insertStudent(Estudiante student) {
        students.add(student);
    }
}
