package com.udea.analisis.matriculaudea.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.analisis.matriculaudea.models.Registro;

@Repository
public interface RegistrosRepository extends JpaRepository<Registro, String> {
    List<Registro> findRegistrosByCodigoMatricula(String CodigoMatricula);
}