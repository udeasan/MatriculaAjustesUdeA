package com.udea.analisis.matriculaudea.models;

public class Curso {
	public String Nombre;

	public String Horario;

	public String Codigo;

	public Curso() {
	}

	public Curso(String nombre, String horario, String codigo) {
		Nombre = nombre;
		Horario = horario;
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getHorario() {
		return Horario;
	}

	public void setHorario(String horario) {
		Horario = horario;
	}

	public Curso VisualizarHorariosGrupos() {
		return null;
	}

	public void VisualizarListaEspera() {
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

}
