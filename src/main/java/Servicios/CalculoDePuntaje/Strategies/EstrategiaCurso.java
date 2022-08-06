package Servicios.CalculoDePuntaje.Strategies;

import Modelo.Colegio.Curso;
import Modelo.Colegio.Votante;

public class EstrategiaCurso extends EstrategiaVotacion{

    public double puntuarVotante(Votante votante){
        return votante.getPromedio() * ((Curso) votante).getAlumnos().size();
    }
}
