package Modelo.Colegio;

import java.util.ArrayList;

public class CrearGraduado extends CrearVotante{

    @Override
    public Votante crearVotante(String nombre, String id, Double promedio, boolean pagaAportes, Votacion peliculaVotada, int grado, ArrayList<Alumno> alumnos) {
        Graduado g = new Graduado(  nombre,  peliculaVotada,  promedio,  pagaAportes);
        return g;
    }

}
