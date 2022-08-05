package Modelo.Colegio;

import Modelo.Pelicula.PeliculaRequest;

import java.util.ArrayList;

public class Colegio {
    ArrayList<Votante> votantes;

    public void setVotantes(ArrayList<Votante> votantes) {
        this.votantes = votantes;
    }

    public ArrayList<Votante> getVotantes() {
        return votantes;
    }

    public void addVotante (Votante votante) {this.votantes.add(votante);}
}
