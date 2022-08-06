package Servicios.CalculoDePuntaje;

import Modelo.Colegio.Votante;
import Servicios.CalculoDePuntaje.Strategies.EstrategiaVotacion;

public class PuntajeVotadorService {

    EstrategiaVotacion estrategiaVotacion;

    public void setEstrategiaVotacion(EstrategiaVotacion estrategiaVotacion) {
        this.estrategiaVotacion = estrategiaVotacion;
    }

    public EstrategiaVotacion getEstrategiaVotacion() {
        return estrategiaVotacion;
    }

    public double puntuarVotante(Votante votante){
        return estrategiaVotacion.puntuarVotante(votante);
    }
}
