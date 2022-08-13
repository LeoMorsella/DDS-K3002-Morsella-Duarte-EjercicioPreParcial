package Servicios.CalculoDePuntaje.Strategies;

import Modelo.Colegio.Alumno;
import Modelo.Colegio.Votante;

public class EstrategiaAlumno extends EstrategiaVotacion{

    public double puntuarVotante(Votante alumno){
        double puntajeTemp = alumno.getPromedio() * ((Alumno) alumno).getGrado();
        if (alumno.getEsDestacado()) puntajeTemp += 20;
        return puntajeTemp;
    }
}
