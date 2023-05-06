package com.udea.analisis.matriculaudea.models;

public class RegistroBody {

    public String idEstudiante;
    public String codigoMatricula;
    public String codigoHorario;

    public RegistroBody() {
    }

    public RegistroBody(String idEstudiante, String codigoMatricula, String codigoHorario) {
        this.idEstudiante = idEstudiante;
        this.codigoMatricula = codigoMatricula;
        this.codigoHorario = codigoHorario;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

}
