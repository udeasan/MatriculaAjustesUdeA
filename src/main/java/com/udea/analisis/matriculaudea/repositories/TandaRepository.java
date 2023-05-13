package com.udea.analisis.matriculaudea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.analisis.matriculaudea.models.Tanda;

@Repository
public interface TandaRepository extends JpaRepository<Tanda, String> {
    
}
