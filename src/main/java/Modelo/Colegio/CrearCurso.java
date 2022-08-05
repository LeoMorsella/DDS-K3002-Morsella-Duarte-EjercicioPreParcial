package Modelo.Colegio;

import java.util.ArrayList;

public class CrearCurso extends CrearVotante{
    public Votante crearVotante(String nombre, String id, Double promedio, boolean pagaAportes, Votacion peliculaVotada, int grado, ArrayList<Alumno> alumnos) {
        Curso c = new Curso( nombre,  peliculaVotada,  promedio,  alumnos);
        return c;
    }
}
