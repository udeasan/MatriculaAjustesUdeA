package com.udea.analisis.matriculaudea.models;

public class Estudiante extends Usuario {

	public String Estado;

	public Estudiante() {
	}

	public Estudiante(String NumeroIdentificacion, String TipoIdentificacion, String Nombre, String Apellidos,
			String CorreoElectronico, String Estado) {
		this.NumeroIdentificacion = NumeroIdentificacion;
		this.TipoIdentificacion = TipoIdentificacion;
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.CorreoElectronico = CorreoElectronico;
		this.Estado = Estado;
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
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

}
