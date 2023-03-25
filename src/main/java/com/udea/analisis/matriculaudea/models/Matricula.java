package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Matricula implements IMatricula {

	@JsonProperty("CodigoMatricula")
	public String codigoMatricula;

	@JsonProperty("NumeroIdentificacionEstudiante")
	public String numeroIdentificacionEstudiante;

	@JsonProperty("CodigoSemestre")
	public String codigoSemestre;

	public Matricula() {
	}

	public Matricula(String codigoMatricula, String numeroIdentificacionEstudiante, String codigoMateria) {
		this.codigoMatricula = codigoMatricula;
		this.numeroIdentificacionEstudiante = numeroIdentificacionEstudiante;
		this.codigoSemestre = codigoMateria;
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
