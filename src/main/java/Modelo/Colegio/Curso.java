package Modelo.Colegio;

import Servicios.Pelicula.APIPelicula.PeliculaResponse;

import java.util.ArrayList;

public class Curso extends Votante{

    ArrayList<Alumno> alumnos;

    String nombre;
    Votacion peliculaVotada;
    Double promedio;
    public Curso(String nombre, Votacion peliculaVotada, Double promedio, ArrayList<Alumno> alumnos) {
        super(nombre, peliculaVotada, promedio);
        this.alumnos = alumnos;
    }

    public ArrayList<Alumno> getVotantes() {
        return alumnos;
    }

    public void setVotantes(ArrayList<Alumno> votantes) {
        this.alumnos = votantes;
    }

}
