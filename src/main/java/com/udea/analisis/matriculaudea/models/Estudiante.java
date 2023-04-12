package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante extends Usuario {

	@Column(name = "EstadoMatricula")
	@JsonProperty("EstadoMatricula")
	public String estadoMatricula;

	@Column(name = "EstadoEstudiante")
	@JsonProperty("EstadoEstudiante")
	public String estadoEstudiante;

	@Column(name = "CarreraAcademica")
	@JsonProperty("CarreraAcademica")
	public String carreraAcademica;

	@Column(name = "PensumVersion")
	@JsonProperty("PensumVersion")
	public int pensumVersion;

	@Column(name = "CreditosCursados")
	@JsonProperty("CreditosCursados")
	public int creditosCursados;

	@Column(name = "SemestreAcademico")
	@JsonProperty("SemestreAcademico")
	public int semestreAcademico;

	public Estudiante() {
	}

	public Estudiante(String NumeroIdentificacion, String TipoIdentificacion, String Nombre, String Apellidos, String CarreraAcademica,
			String CorreoElectronico, String EstadoMatricula, String EstadoEstudiante, int PensumVersion, int CreditosCursados, int SemestreAcademico) {
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

	public int getPensumVersion() {
		return pensumVersion;
	}

	public void setPensumVersion(int pensumVersion) {
		this.pensumVersion = pensumVersion;
	}

	public int getCreditosCursados() {
		return creditosCursados;
	}

	public void setCreditosCursados(int creditosCursados) {
		this.creditosCursados = creditosCursados;
	}

	public int getSemestreAcademico() {
		return semestreAcademico;
	}

	public void setSemestreAcademico(int semestreAcademico) {
		this.semestreAcademico = semestreAcademico;
	}
}
