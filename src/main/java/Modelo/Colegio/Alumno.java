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
}
