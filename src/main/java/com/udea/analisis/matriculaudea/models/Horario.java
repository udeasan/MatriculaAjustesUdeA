package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "horarios")
public class Horario {
    
    @Column(name = "id_curso")
    @JsonProperty("IdCurso")
    public String idCurso;

    @Column(name = "grupo")
    @JsonProperty("Grupo")
    public String grupo;

    @Id
    @Column(name = "codigo")
    @JsonProperty("Codigo")
    public String codigo;

    @Column(name = "horario")
    @JsonProperty("Horario")
    public String horario;

    @Column(name = "cupos_disponibles")
    @JsonProperty("CuposDisponibles")
    public Integer cuposDisponibles;

    @Column(name = "matriculados")
    @JsonProperty("Matriculados")
    public Integer matriculados;

    public Horario() {
    }

    public Horario(String idCurso, String grupo, String codigo, String horario, Integer cuposDisponibles,
            Integer matriculados) {
        this.idCurso = idCurso;
        this.grupo = grupo;
        this.codigo = codigo;
        this.horario = horario;
        this.cuposDisponibles = cuposDisponibles;
        this.matriculados = matriculados;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(Integer cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public Integer getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(Integer matriculados) {
        this.matriculados = matriculados;
    }
}
