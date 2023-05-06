package com.udea.analisis.matriculaudea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.analisis.matriculaudea.models.Matricula;

@Repository
public interface MatriculasRepository extends JpaRepository<Matricula, String> {
    Matricula findByNumeroIdentificacionEstudiante(String numeroIDentificacionEstudiante);
}
