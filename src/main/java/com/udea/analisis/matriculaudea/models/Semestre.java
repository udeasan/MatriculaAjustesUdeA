package com.udea.analisis.matriculaudea.models;
public class Semestre {
	public String Anio;

	public String SemestreAnio;

	public Matricula Matriculas;

	public Semestre() {
	}

	public String getAnio() {
		return Anio;
	}

	public Semestre(String anio, String semestreAnio, Matricula matriculas) {
		Anio = anio;
		SemestreAnio = semestreAnio;
		Matriculas = matriculas;
	}

	public void setAnio(String anio) {
		Anio = anio;
	}

	public String getSemestreAnio() {
		return SemestreAnio;
	}

	public void setSemestreAnio(String semestreAnio) {
		SemestreAnio = semestreAnio;
	}

	public Matricula getMatriculas() {
		return Matriculas;
	}

	public void setMatriculas(Matricula matriculas) {
		Matriculas = matriculas;
	}

}
