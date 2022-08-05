package Modelo.Colegio;

import Servicios.Pelicula.APIPelicula.PeliculaResponse;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Votante{

    ArrayList<Alumno> alumnos;

    String nombre;
    Votacion peliculaVotada;
    Double promedio;
    public Curso Curso() {return new Curso();}

    public ArrayList<Alumno> getVotantes() {
        return alumnos;
    }

    public void setVotantes(ArrayList<Alumno> votantes) {
        this.alumnos = votantes;
    }

    public void cargarParametros(List<Object> parametros){
        this.nombre = (String) parametros.get(0);
        this.promedio = (Double) parametros.get(1);
    }

}
