package Modelo.Colegio;

import javax.persistence.Entity;

@Entity
public class Alumno extends Votante {
    int grado;

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public Alumno(String nombre, String id, String dni, Votacion peliculaVotada,int grado) {
        super(nombre , id , dni , peliculaVotada );
        this.grado = grado;
    }

    public Votante clone() {
        return new Alumno(nombre, id, dni, peliculaVotada, grado);
    }
}
