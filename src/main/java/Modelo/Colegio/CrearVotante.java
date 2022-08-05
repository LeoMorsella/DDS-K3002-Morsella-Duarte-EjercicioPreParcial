package Modelo.Colegio;

import java.util.ArrayList;

public abstract class CrearVotante {

    abstract public Votante crearVotante(String nombre, String id, Double promedio, boolean pagaAportes, Votacion peliculaVotada, int grado, ArrayList<Alumno> alumnos);

}
