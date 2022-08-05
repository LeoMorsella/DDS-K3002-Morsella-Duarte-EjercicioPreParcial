package Modelo.Colegio;

import javax.persistence.*;

// Actualizar para prototype
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Votante {
    String nombre;

    @Id
    @GeneratedValue
    String id;

    @Transient
    Votacion peliculaVotada;

    Double promedio;

    public Votante() {}
    public Votante(String nombre, Votacion peliculaVotada, Double promedio) {
        this.nombre = nombre;
        this.peliculaVotada = peliculaVotada;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Votacion getPeliculaVotada() {
        return peliculaVotada;
    }

    public void setPeliculaVotada(Votacion peliculaVotada) {
        this.peliculaVotada = peliculaVotada;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
