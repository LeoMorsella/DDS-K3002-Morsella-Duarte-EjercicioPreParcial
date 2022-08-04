package Modelo.Colegio;

import java.util.ArrayList;

public class CrearAlumno extends  CrearVotante{

    @Override
    public Votante crearVotante(String nombre, String id, Double promedio, boolean pagaAportes, Votacion peliculaVotada, int grado, ArrayList<Alumno> alumnos) {

        Alumno a = new Alumno(nombre, peliculaVotada,  promedio, grado);
        return a;

    }
}
