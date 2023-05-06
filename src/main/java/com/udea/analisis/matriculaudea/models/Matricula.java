package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matriculas")
public class Matricula implements IMatricula {

	@Id
	@Column(name = "codigo_matricula")
	@JsonProperty("CodigoMatricula")
	public String codigoMatricula;

	@Column(name = "numero_identificacion")
	@JsonProperty("NumeroIdentificacionEstudiante")
	public String numeroIdentificacionEstudiante;

	@Column(name = "codigo_semestre")
	@JsonProperty("CodigoSemestre")
	public String codigoSemestre;

	@Column(name = "estado_matricula")
	@JsonProperty("EstadoMatricula")
	public String estadoMatricula;

	public Matricula() {
	}

	public Matricula(String codigoMatricula, String numeroIdentificacionEstudiante, String codigoSemestre, String estadoMatricula) {
		this.codigoMatricula = codigoMatricula;
		this.numeroIdentificacionEstudiante = numeroIdentificacionEstudiante;
		this.codigoSemestre = codigoSemestre;
		this.estadoMatricula = estadoMatricula;
	}

	public String getCodigoMatricula() {
		return codigoMatricula;
	}

	public void setCodigoMatricula(String codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public String getNumeroIdentificacionEstudiante() {
		return numeroIdentificacionEstudiante;
	}

	public void setNumeroIdentificacionEstudiante(String numeroIdentificacionEstudiante) {
		this.numeroIdentificacionEstudiante = numeroIdentificacionEstudiante;
	}

	public String getCodigoSemestre() {
		return codigoSemestre;
	}

	public void setCodigoSemestre(String codigoMateria) {
		this.codigoSemestre = codigoMateria;
	}

	public String getEstadoMatricula() {
		return estadoMatricula;
	}

	public void SetEstadoMatricula(String estadoMatricula) {
		this.estadoMatricula = estadoMatricula;
	}

	@Override
	public void AnadirCurso() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'AnadirCurso'");
	}

	@Override
	public void CargarDesdePreMatricula() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'CargarDesdePreMatricula'");
	}

	@Override
	public void EliminarCurso() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'EliminarCurso'");
	}

	@Override
	public void EliminarGrupo() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'EliminarGrupo'");
	}

	@Override
	public void ModificarGrupo() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'ModificarGrupo'");
	}

	@Override
	public void ModificarPreMatricula() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'ModificarPreMatricula'");
	}

	@Override
	public void SeleccionarGrupo() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'SeleccionarGrupo'");
	}

	@Override
	public Curso VisualizarListado() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'VisualizarListado'");
	}

	@Override
	public void VisualizarIntentoDeMatricula() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'VisualizarIntentoDeMatricula'");
	}

}
