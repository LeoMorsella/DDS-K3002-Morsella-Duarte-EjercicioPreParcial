package Servicios.CalculoDePuntaje;

import Modelo.Colegio.Votante;

abstract public class EstrategiaVotacion {

    abstract public double puntuarVotante(Votante votante);
}
