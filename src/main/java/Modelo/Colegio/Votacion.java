package Modelo.Colegio;

import Modelo.Pelicula.PeliculaResponse;

import javax.persistence.*;

@Entity
public class Votacion {
  @Id
  @GeneratedValue
  int id_votacion;
  @ManyToOne
  PeliculaResponse pelicula;
  @OneToOne
  Votante votante;

  public  Votacion()  {}
  public Votacion(PeliculaResponse pelicula, Votante votante) {
    this.pelicula = pelicula;
    this.votante = votante;
  }

  public PeliculaResponse getPelicula() {
    return pelicula;
  }

  public Votante getVotante() {
    return votante;
  }
}
