package com.udea.analisis.matriculaudea.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.analisis.matriculaudea.models.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, String> {
    List<Horario> findByIdCurso(String IdCurso);
}
