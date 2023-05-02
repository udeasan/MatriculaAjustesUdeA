package com.udea.analisis.matriculaudea.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.udea.analisis.matriculaudea.models.Estudiante;

public class EstudianteServiceTest {

    EstudianteService estudianteService;

    @Before
    public void setUp() throws Exception {
        estudianteService = new EstudianteService();
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Santiago");
        estudiante1.setNumeroIdentificacion("1040123");
        estudianteService.insertStudent(estudiante1);
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Sandra");
        estudiante2.setNumeroIdentificacion("4310581");
        estudianteService.insertStudent(estudiante2);
    }

    @Test
    public void testFindAllStudents() {
        ArrayList<Estudiante> students = estudianteService.findAllStudents();
        assertNotNull(students);
        assertEquals(2, students.size());
    }

    @Test
    public void testGetStudentByID() {
        Estudiante student = estudianteService.getStudentByID("1040123");
        assertNotNull(student);
        assertEquals("Santiago", student.getNombre());
        assertEquals("1040123", student.getNumeroIdentificacion());
    }

    @Test
    public void testInsertStudent() {
        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Sindy");
        estudiante3.setNumeroIdentificacion("5432122");
        estudianteService.insertStudent(estudiante3);
        ArrayList<Estudiante> students = estudianteService.findAllStudents();
        assertEquals(3, students.size());
        Estudiante student = estudianteService.getStudentByID("5432122");
        assertNotNull(student);
        assertEquals("Sindy", student.getNombre());
        assertEquals("5432122", student.getNumeroIdentificacion());
    }
}
