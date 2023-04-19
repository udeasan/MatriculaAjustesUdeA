package com.udea.analisis.matriculaudea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.analisis.matriculaudea.models.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String> {
    Estudiante findByNumeroIdentificacion(String numero_identificicacion);
}
