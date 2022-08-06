package Modelo.Colegio;

import Modelo.Pelicula.PeliculaRequest;

import java.util.ArrayList;

public class Colegio {
    ArrayList<Votante> votantes = new ArrayList<>();
    ArrayList<Votante> destacados = new ArrayList<>();

    public void setVotantes(ArrayList<Votante> votantes) {
        this.votantes = votantes;
    }

    public ArrayList<Votante> getVotantes() {
        return votantes;
    }

    public void addVotante (Votante votante) {this.votantes.add(votante);}

    public ArrayList<Votante> getDestacados() {
        return destacados;
    }

    public void setDestacados(ArrayList<Votante> destacados) {
        this.destacados = destacados;
    }

    public void addDestacado (Votante destacado) {this.destacados.add(destacado);}
}
