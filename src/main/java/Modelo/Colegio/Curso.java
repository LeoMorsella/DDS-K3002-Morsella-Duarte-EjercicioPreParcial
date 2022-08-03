package Modelo.Colegio;

import Servicios.Pelicula.APIPelicula.PeliculaResponse;

import java.util.ArrayList;

public class Curso extends Votante{

    ArrayList<Votante> votantes;

    String nombre;
    Votacion peliculaVotada;
    Double promedio;
    public Curso(String nombre, Votacion peliculaVotada, Double promedio, ArrayList<Votante> votantes) {
        super(nombre, peliculaVotada, promedio);
        this.votantes = votantes;
    }

    public ArrayList<Votante> getVotantes() {
        return votantes;
    }

    public void setVotantes(ArrayList<Votante> votantes) {
        this.votantes = votantes;
    }

    @Override
    public Votante clone() {
        return null;
    }
}
