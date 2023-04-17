package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante extends Usuario {

	@Column(name = "estado_matricula")
	@JsonProperty("EstadoMatricula")
	public String estadoMatricula;

	@Column(name = "estado_estudiante")
	@JsonProperty("EstadoEstudiante")
	public String estadoEstudiante;

	@Column(name = "carrera_academica")
	@JsonProperty("CarreraAcademica")
	public String carreraAcademica;

	@Column(name = "pensum_version")
	@JsonProperty("PensumVersion")
	public Integer pensumVersion;

	@Column(name = "creditos_cursados")
	@JsonProperty("CreditosCursados")
	public Integer creditosCursados;

	@Column(name = "semestre_academico")
	@JsonProperty("SemestreAcademico")
	public Integer semestreAcademico;

	public Estudiante() {
	}

	public Estudiante(String NumeroIdentificacion, String TipoIdentificacion, String Nombre, String Apellidos, String CarreraAcademica,
			String CorreoElectronico, String EstadoMatricula, String EstadoEstudiante, Integer PensumVersion, Integer CreditosCursados, Integer SemestreAcademico) {
		this.numeroIdentificacion = NumeroIdentificacion;
		this.tipoIdentificacion = TipoIdentificacion;
		this.nombre = Nombre;
		this.apellidos = Apellidos;
		this.correoElectronico = CorreoElectronico;
		this.estadoEstudiante = EstadoEstudiante;
		this.estadoMatricula = EstadoMatricula;
		this.carreraAcademica = CarreraAcademica;
		this.pensumVersion = PensumVersion;
		this.creditosCursados = CreditosCursados;
		this.semestreAcademico = SemestreAcademico;
	}

	public void IniciarSesion() {

	}

	public String ConsultarTandaFecha() {
		return "";
	}

	public Matricula ConsultarOferta() {
		return null;
	}

	public String getEstadoMatricula() {
		return estadoMatricula;
	}

	public void setEstadoMatricula(String estadoMatricula) {
		this.estadoMatricula = estadoMatricula;
	}

	public String getEstadoEstudiante() {
		return estadoEstudiante;
	}

	public void setEstadoEstudiante(String estadoEstudiante) {
		this.estadoEstudiante = estadoEstudiante;
	}

	public String getCarreraAcademica() {
		return carreraAcademica;
	}

	public void setCarreraAcademica(String carreraAcademica) {
		this.carreraAcademica = carreraAcademica;
	}

	public Integer getPensumVersion() {
		return pensumVersion;
	}

	public void setPensumVersion(Integer pensumVersion) {
		this.pensumVersion = pensumVersion;
	}

	public Integer getCreditosCursados() {
		return creditosCursados;
	}

	public void setCreditosCursados(Integer creditosCursados) {
		this.creditosCursados = creditosCursados;
	}

	public Integer getSemestreAcademico() {
		return semestreAcademico;
	}

	public void setSemestreAcademico(int semestreAcademico) {
		this.semestreAcademico = semestreAcademico;
	}
}
