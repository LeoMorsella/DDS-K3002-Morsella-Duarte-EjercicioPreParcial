package Modelo.Colegio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Alumno extends Votante {
    int grado;

    String nombre;
    String id;
    Votacion peliculaVotada;
    Double promedio;

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public Alumno(String nombre, Votacion peliculaVotada, Double promedio, int grado) {
        super(nombre , peliculaVotada, promedio);
        this.grado = grado;
    }

    public Votante clone() {
        return new Alumno(nombre, peliculaVotada, promedio, grado);
    }
}
