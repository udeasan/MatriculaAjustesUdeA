package com.udea.analisis.matriculaudea.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Semestre {

	@JsonProperty("CodigoSemestre")
	public String codigoSemestre;

	@JsonProperty("InicioMatricula")
	public String inicioMatricula;

	@JsonProperty("FinMatricula")
	public String finMatricula;

	@JsonProperty("InicioClases")
	public String inicioClases;

	@JsonProperty("FinClases")
	public String finClases;

	public Semestre() {
	}

	public Semestre(String codigoSemestre, String inicioMatricula, String finMatricula, String inicioClases,
			String finClases) {
		this.codigoSemestre = codigoSemestre;
		this.inicioMatricula = inicioMatricula;
		this.finMatricula = finMatricula;
		this.inicioClases = inicioClases;
		this.finClases = finClases;
	}

	public String getCodigoSemestre() {
		return codigoSemestre;
	}

	public void setCodigoSemestre(String codigoSemestre) {
		this.codigoSemestre = codigoSemestre;
	}

	public String getInicioMatricula() {
		return inicioMatricula;
	}

	public void setInicioMatricula(String inicioMatricula) {
		this.inicioMatricula = inicioMatricula;
	}

	public String getFinMatricula() {
		return finMatricula;
	}

	public void setFinMatricula(String finMatricula) {
		this.finMatricula = finMatricula;
	}

	public String getInicioClases() {
		return inicioClases;
	}

	public void setInicioClases(String inicioClases) {
		this.inicioClases = inicioClases;
	}

	public String getFinClases() {
		return finClases;
	}

	public void setFinClases(String finClases) {
		this.finClases = finClases;
	}

	

}
