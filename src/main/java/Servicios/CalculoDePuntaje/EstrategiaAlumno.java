package Servicios.CalculoDePuntaje;

import Modelo.Colegio.Alumno;
import Modelo.Colegio.Votante;

public class EstrategiaAlumno extends EstrategiaVotacion{

    public double puntuarVotante(Votante votante){
        return votante.getPromedio() * ((Alumno) votante).getGrado();
    }
}
