package Colegio;

import Pelicula.Pelicula;

import java.util.ArrayList;

public class Colegio {
    ArrayList<Pelicula> peliculas;
    ArrayList<Alumno> alumnos;

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
