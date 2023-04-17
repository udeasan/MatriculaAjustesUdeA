package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Usuario {

    @Id
    @JsonProperty("NumeroIdentificacion")
    @Column(name = "numero_identificacion")
    public String numeroIdentificacion;

    @JsonProperty("TipoIdentificacion")
    @Column(name = "tipo_identificacion")
    public String tipoIdentificacion;

    @JsonProperty("Nombres")
    @Column(name = "nombres")
    public String nombre;

    @JsonProperty("Apellidos")
    @Column(name = "apellidos")
    public String apellidos;

    @JsonProperty("CorreoElectronico")
    @Column(name = "correo_electronico")
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
