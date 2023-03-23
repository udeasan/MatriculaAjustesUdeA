package com.udea.analisis.matriculaudea.models;

public interface IMatricula {

    public void AnadirCurso();

    public void CargarDesdePreMatricula();

    public void EliminarCurso();

    public void EliminarGrupo();

    public void ModificarGrupo();

    public void ModificarPreMatricula();

    public void SeleccionarGrupo();

    public Curso VisualizarListado();

    public void VisualizarIntentoDeMatricula();

}
