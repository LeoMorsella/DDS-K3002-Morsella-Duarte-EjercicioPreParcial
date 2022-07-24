package Servicios.CalculoDePuntaje;

import Servicios.Pelicula.APIPelicula.PeliculaResponse;

import java.util.List;

public class PuntajePeliculaService {

    static public double puntuarPelicula(PeliculaResponse pelicula){
        return puntuarOrigen(pelicula.getPaisesOrigen()) + puntuarIdioma(pelicula.getIdiomas());
    }

    static private double puntuarOrigen(List<String> origen){
        return 0;
    }

    static private double puntuarIdioma(List<String> idiomas){
        return 0;
    }
}
