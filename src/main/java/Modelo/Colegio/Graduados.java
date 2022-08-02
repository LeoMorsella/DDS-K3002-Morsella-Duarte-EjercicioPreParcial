package Modelo.Colegio;

import javax.persistence.Entity;

@Entity
public class Graduados extends Votante{
    public Graduados(String nombre, String id, String dni, Votacion peliculaVotada) {
        super(nombre , id , dni , peliculaVotada );

    }

    public Votante clone() {
        return new Graduados(nombre, id, dni, peliculaVotada);
    }
}
