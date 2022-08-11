package Servicios.CalculoDePuntaje.Strategies;

import Modelo.Colegio.Graduado;
import Modelo.Colegio.Votante;

public class EstrategiaGraduado extends EstrategiaVotacion {

    public double puntuarVotante(Votante votante){
        if(((Graduado) votante).getPagaAportes()) {
            if(votante.esDestacado()) return votante.getPromedio() + 20;
            else return votante.getPromedio();
        }
        else return 0;
    }

}
