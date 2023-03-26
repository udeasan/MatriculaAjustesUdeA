package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Curso {

	@JsonProperty("Codigo")
	public String codigo;

	@JsonProperty("Nombre")
	public String nombre;

	@JsonProperty("Horario")
	public String horario;

	@JsonProperty("Creditos")
	public String creditos;

	@JsonProperty("Cupos")
	public String cupos;

	@JsonProperty("Prerrequisitos")
	public String prerrequisitos;

	@JsonProperty("Correquisitos")
	public String correquisitos;

	public Curso() {
	}

	public Curso(String codigo, String nombre, String horario, String creditos, String cupos, String prerrequisitos,
			String correquisitos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horario = horario;
		this.creditos = creditos;
		this.cupos = cupos;
		this.prerrequisitos = prerrequisitos;
		this.correquisitos = correquisitos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

	public String getCupos() {
		return cupos;
	}

	public void setCupos(String cupos) {
		this.cupos = cupos;
	}

	public String getPrerrequisitos() {
		return prerrequisitos;
	}

	public void setPrerrequisitos(String prerrequisitos) {
		this.prerrequisitos = prerrequisitos;
	}

	public String getCorrequisitos() {
		return correquisitos;
	}

	public void setCorrequisitos(String correquisitos) {
		this.correquisitos = correquisitos;
	}

}
