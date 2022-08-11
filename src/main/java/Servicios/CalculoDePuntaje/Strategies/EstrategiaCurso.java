package Servicios.CalculoDePuntaje.Strategies;

import Modelo.Colegio.Curso;
import Modelo.Colegio.Votante;

public class EstrategiaCurso extends EstrategiaVotacion{

    public double puntuarVotante(Votante curso){
        double puntajeTemp = curso.getPromedio() * ((Curso) curso).getAlumnos().size();
        if (curso.esDestacado()) puntajeTemp += 20;
        return puntajeTemp;
    }
}
