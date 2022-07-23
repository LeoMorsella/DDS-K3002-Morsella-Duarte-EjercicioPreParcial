package Votaciones;

import Colegio.Alumno;
import Colegio.Votante;

import Pelicula.APIPelicula.PeliculaResponse;

import javax.persistence.*;

//@Entity
public class Votacion {
  //  @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_votacion;

    //@ManyToOne
    PeliculaResponse pelicula;

    //@ManyToOne
    Votante votante;

}
