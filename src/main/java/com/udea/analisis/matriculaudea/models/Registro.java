package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Registro {

    @JsonProperty("CodigoMatricula")
    public String codigoMatricula;

    @JsonProperty("CodigoMateria")
    public String codigoMateria;

    @JsonProperty("NumeroIdentificacionEstudiante")
    public String numeroIdentificacionEstudiante;

    @JsonProperty("EstadoMateria")
    public String estadoMateria;

    public Registro() {
    }

    public Registro(String codigoMatricula, String codigoMateria, String numeroIdentificacionEstudiante,
            String estadoMateria) {
        this.codigoMatricula = codigoMatricula;
        this.codigoMateria = codigoMateria;
        this.numeroIdentificacionEstudiante = numeroIdentificacionEstudiante;
        this.estadoMateria = estadoMateria;
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

    public String getNumeroIdentificacionEstudiante() {
        return numeroIdentificacionEstudiante;
    }

    public void setNumeroIdentificacionEstudiante(String numeroIdentificacionEstudiante) {
        this.numeroIdentificacionEstudiante = numeroIdentificacionEstudiante;
    }

    public String getEstadoMateria() {
        return estadoMateria;
    }

    public void setEstadoMateria(String estadoMateria) {
        this.estadoMateria = estadoMateria;
    }

}
