package Servicios.CalculoDePuntaje.Strategies;

import Modelo.Colegio.Graduado;
import Modelo.Colegio.Votante;

public class EstrategiaGraduado extends EstrategiaVotacion {

    public double puntuarVotante(Votante alumno){
        if(((Graduado) alumno).getPagaAportes()) {
            if(alumno.getEsDestacado()) return alumno.getPromedio() + 20;
            else return alumno.getPromedio();
        }
        else return 0;
    }

}
