package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Usuario {

    @JsonProperty("NumeroIdentificacion")
    public String numeroIdentificacion;

    @JsonProperty("TipoIdentificacion")
    public String tipoIdentificacion;

    @JsonProperty("Nombres")
    public String nombre;

    @JsonProperty("Apellidos")
    public String apellidos;

    @JsonProperty("CorreoElectronico")
    public String correoElectronico;

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String NumeroIdentificacion) {
        this.numeroIdentificacion = NumeroIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String TipoIdentificacion) {
        this.tipoIdentificacion = TipoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.correoElectronico = CorreoElectronico;
    }

}
