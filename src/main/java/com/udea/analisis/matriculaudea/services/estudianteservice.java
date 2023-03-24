package com.udea.analisis.matriculaudea.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.udea.analisis.matriculaudea.models.Estudiante;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.IEstudianteService;

@Service
public class estudianteservice implements IEstudianteService {
    ArrayList<Estudiante> students;

    Estudiante pedro = new Estudiante("123", "CC", "Pedro", "Lopez", "pedro@gmail.com", "NORMAL");
    Estudiante camilo = new Estudiante("1434", "CC", "Camilo", "Lopez", "pedro@gmail.com", "NORMAL");
    Estudiante sandra = new Estudiante("13443", "CC", "Sandra", "Lopez", "pedro@gmail.com", "NORMAL");

    @Override
    public ArrayList<Estudiante> findAllStudents() {
        students = new ArrayList<Estudiante>();
        students.add(pedro);
        students.add(sandra);
        students.add(camilo);
        return students;
    }

    @Override
    public Estudiante getStudentByID(String id) {
        Estudiante myStudent = new Estudiante();
        for (Estudiante estudiante : students) {
            if (estudiante.NumeroIdentificacion.equals(id)) {
                myStudent.Nombre = estudiante.Nombre;
                myStudent.NumeroIdentificacion = estudiante.NumeroIdentificacion;
            }
        }
        return myStudent;
    }

    @Override
    public void insertStudent(Estudiante student) {
        students.add(student);
    }
}
