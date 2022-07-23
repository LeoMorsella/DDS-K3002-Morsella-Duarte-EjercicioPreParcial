package Colegio;

import Pelicula.Pelicula;

import javax.persistence.*;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Votante {
  //  @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_votante;
    String nombre;
    String id;
    String dni;
    Pelicula peliculaVotada;

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public Pelicula getPeliculaVotada() {
        return peliculaVotada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPeliculaVotada(Pelicula peliculaVotada) {
        this.peliculaVotada = peliculaVotada;
    }
}
