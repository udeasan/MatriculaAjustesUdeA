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
        Estudiante pedro = new Estudiante("123", "CC", "Pedro", "Lopez", "pedro@gmail.com", "NORMAL");
        Estudiante camilo = new Estudiante("1434", "CC", "Camilo", "Lopez", "pedro@gmail.com", "NORMAL");
        Estudiante sandra = new Estudiante("13443", "CC", "Sandra", "Lopez", "pedro@gmail.com", "NORMAL");
        students.add(pedro);
        students.add(sandra);
        students.add(camilo);
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
