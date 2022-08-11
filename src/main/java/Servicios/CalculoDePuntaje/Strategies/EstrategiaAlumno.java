package Servicios.CalculoDePuntaje.Strategies;

import Modelo.Colegio.Alumno;
import Modelo.Colegio.Votante;

public class EstrategiaAlumno extends EstrategiaVotacion{

    public double puntuarVotante(Votante votante){
        double puntajeTemp = votante.getPromedio() * ((Alumno) votante).getGrado();
        if (votante.esDestacado()) puntajeTemp += 20;
        return puntajeTemp;
    }
}
