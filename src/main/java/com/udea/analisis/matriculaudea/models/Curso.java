package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {

	@Id
	@Column(name = "codigo")
	@JsonProperty("Codigo")
	public String codigo;

	@Column(name = "nombre")
	@JsonProperty("Nombre")
	public String nombre;

	@Column(name = "horario")
	@JsonProperty("Horario")
	public String horario;

	@Column(name = "nivel")
	@JsonProperty("Nivel")
	public Integer nivel;

	@Column(name = "creditos")
	@JsonProperty("Creditos")
	public String creditos;

	@Column(name = "cupos")
	@JsonProperty("Cupos")
	public String cupos;

	@Column(name = "prerrequisitos")
	@JsonProperty("Prerrequisitos")
	public String prerrequisitos;

	@Column(name = "correquisitos")
	@JsonProperty("Correquisitos")
	public String correquisitos;

	public Curso() {
	}

	public Curso(String codigo, String nombre, String horario, String creditos, String cupos, String prerrequisitos,
			String correquisitos, Integer nivel) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horario = horario;
		this.creditos = creditos;
		this.cupos = cupos;
		this.prerrequisitos = prerrequisitos;
		this.correquisitos = correquisitos;
		this.nivel = nivel;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
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
