package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registros")
public class Registro {

    @Id
    @Column(name = "id_registro")
    @JsonProperty("IdRegistro")
    public String idRegistro;

    @Column(name = "codigo_matricula")
    @JsonProperty("CodigoMatricula")
    public String codigoMatricula;

    @Column(name = "codigo_materia")
    @JsonProperty("CodigoMateria")
    public String codigoMateria;

    @Column(name = "codigo_horario")
    @JsonProperty("CodigoHorario")
    public String codigoHorario;

    @Column(name = "numero_identificacion")
    @JsonProperty("NumeroIdentificacionEstudiante")
    public String numeroIdentificacionEstudiante;

    @Column(name = "estado_registro")
    @JsonProperty("EstadoRegistro")
    public String estadoRegistro;

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public String getNumeroIdentificacionEstudiante() {
        return numeroIdentificacionEstudiante;
    }

    public void setNumeroIdentificacionEstudiante(String numeroIdentificacionEstudiante) {
        this.numeroIdentificacionEstudiante = numeroIdentificacionEstudiante;
    }

    public String getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public Registro() {
    }

    public Registro(String idRegistro, String codigoMatricula, String codigoMateria, String codigoHorario,
            String numeroIdentificacionEstudiante, String estadoRegistro) {
        this.idRegistro = idRegistro;
        this.codigoMatricula = codigoMatricula;
        this.codigoMateria = codigoMateria;
        this.codigoHorario = codigoHorario;
        this.numeroIdentificacionEstudiante = numeroIdentificacionEstudiante;
        this.estadoRegistro = estadoRegistro;
    }

}
