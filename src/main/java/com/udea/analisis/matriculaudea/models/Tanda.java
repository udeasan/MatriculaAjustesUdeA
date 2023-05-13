package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tandas")
public class Tanda {
    @Id
    @Column(name="id_tanda")
    @JsonProperty("IdTanda")
    public String idTanda;
    
    @Column(name="dia")
    @JsonProperty("Dia")
    public String dia;

    @Column(name="horario")
    @JsonProperty("Horario")
    public String horario;
    
}
