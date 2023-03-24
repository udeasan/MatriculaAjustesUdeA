package com.udea.analisis.matriculaudea.models;

import java.util.ArrayList;

public class Matricula implements IMatricula {

	public Semestre Semestre;

	public ArrayList<String> Materias;

	public Estudiante Estudiante;

	public Matricula() {
	}

	public Matricula(com.udea.analisis.matriculaudea.models.Semestre semestre, ArrayList<String> materias,
			com.udea.analisis.matriculaudea.models.Estudiante estudiante) {
		Semestre = semestre;
		Materias = materias;
		Estudiante = estudiante;
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
