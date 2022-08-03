package Servicios.CalculoDePuntaje;

import Modelo.Colegio.Graduado;
import Modelo.Colegio.Votante;

public class EstrategiaGraduado extends EstrategiaVotacion {

    public double puntuarVotante(Votante votante){
        if(((Graduado) votante).getPagaAportes()) return votante.getPromedio();
        return 0;
    }

}
