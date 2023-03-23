package com.udea.analisis.matriculaudea.models;

public class Matricula implements IMatricula {

	public Semestre Semestre;

	public Curso Materias;

	public Estudiante Estudiante;

	public Matricula() {
		super();
	}

	@Override
	public void AnadirCurso() {

	}

	@Override
	public void CargarDesdePreMatricula() {

	}

	@Override
	public void EliminarCurso() {

	}

	@Override
	public void EliminarGrupo() {
	}

	@Override
	public void ModificarGrupo() {
	}

	@Override
	public void ModificarPreMatricula() {
	}

	@Override
	public void SeleccionarGrupo() {
	}

	@Override
	public Curso VisualizarListado() {
		return null;
	}

	@Override
	public void VisualizarIntentoDeMatricula() {
	}

}
