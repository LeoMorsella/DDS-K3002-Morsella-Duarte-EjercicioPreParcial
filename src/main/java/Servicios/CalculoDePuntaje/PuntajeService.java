package Servicios.CalculoDePuntaje;

import Modelo.Colegio.Votacion;

public class PuntajeService {

    static double calcularPuntaje(Votacion votacion){
        double puntajePelicula = PuntajePeliculaService.puntuarPelicula(votacion.getPelicula());
        return 0;
    }
}
