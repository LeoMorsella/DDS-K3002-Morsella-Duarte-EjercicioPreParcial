package Servicios.CalculoDePuntaje.Strategies;

import Modelo.Colegio.Curso;
import Modelo.Colegio.Votante;

public class EstrategiaCurso extends EstrategiaVotacion{

    public double puntuarVotante(Votante curso){
        double puntajeTemp = curso.getPromedio() * ((Curso) curso).getCantAlumnos();
        if (curso.getEsDestacado()) puntajeTemp += 20;
        return puntajeTemp;
    }
}
