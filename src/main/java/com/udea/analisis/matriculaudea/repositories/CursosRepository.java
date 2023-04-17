package com.udea.analisis.matriculaudea.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.analisis.matriculaudea.models.Curso;

@Repository
public interface CursosRepository extends JpaRepository<Curso, String>{
    List<Curso> findByNivel(Integer nivel);
}
