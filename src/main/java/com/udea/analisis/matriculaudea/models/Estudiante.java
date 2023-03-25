package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Estudiante extends Usuario {

	@JsonProperty("Estado")
	public String estado;

	public Estudiante() {
	}

	public Estudiante(String NumeroIdentificacion, String TipoIdentificacion, String Nombre, String Apellidos,
			String CorreoElectronico, String Estado) {
		this.numeroIdentificacion = NumeroIdentificacion;
		this.tipoIdentificacion = TipoIdentificacion;
		this.nombre = Nombre;
		this.apellidos = Apellidos;
		this.correoElectronico = CorreoElectronico;
		this.estado = Estado;
	}

	public void IniciarSesion() {

	}

	public String ConsultarTandaFecha() {
		return "";
	}

	public Matricula ConsultarOferta() {
		return null;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
