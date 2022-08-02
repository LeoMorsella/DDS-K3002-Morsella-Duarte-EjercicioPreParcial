package Modelo.Colegio;

import Modelo.Colegio.Votante;

import Servicios.Pelicula.APIPelicula.PeliculaResponse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Votacion {
  @Id
  @GeneratedValue
  int id_votacion;
  @ManyToOne
  PeliculaResponse pelicula;
  @ManyToOne
  Votante votante;

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
