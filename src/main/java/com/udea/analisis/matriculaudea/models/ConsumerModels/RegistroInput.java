package com.udea.analisis.matriculaudea.models.ConsumerModels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistroInput {

    @JsonProperty("CodigoMatricula")
    public String codigoMatricula;

    @JsonProperty("CodigoMateria")
    public String codigoMateria;

    @JsonProperty("NumeroIdentificacionEstudiante")
    public String numeroIdentificacionEstudiante;

    public RegistroInput() {
    }

    public RegistroInput(String codigoMatricula, String codigoMateria, String numeroIdentificacionEstudiante) {
        this.codigoMatricula = codigoMatricula;
        this.codigoMateria = codigoMateria;
        this.numeroIdentificacionEstudiante = numeroIdentificacionEstudiante;
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
}
