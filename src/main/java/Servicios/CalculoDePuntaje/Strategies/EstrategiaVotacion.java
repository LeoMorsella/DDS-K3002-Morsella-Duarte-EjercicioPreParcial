package Servicios.CalculoDePuntaje.Strategies;

import Modelo.Colegio.Votante;

abstract public class EstrategiaVotacion {

    abstract public double puntuarVotante(Votante votante);
}
