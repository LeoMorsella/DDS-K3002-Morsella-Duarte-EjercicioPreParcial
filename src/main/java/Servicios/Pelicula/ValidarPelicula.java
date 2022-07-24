package Servicios.Pelicula;

import Modelo.Pelicula.Pelicula;
import Servicios.Pelicula.APIPelicula.APIPeliculaService;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;

public class ValidarPelicula {


    static public PeliculaResponse validarPelicula(Pelicula pelicula) throws Exception {
      try{
       PeliculaResponse nuevaPelicula =
               new APIPeliculaService().buscarPelicula(pelicula.getNombre(), pelicula.getAño());
       if (clasificacionValida(nuevaPelicula)) return nuevaPelicula;
       peliculaNoValida();
      }
      catch(Exception e){
          peliculaNoValida();
        }
      return null;
    }

    static private Void peliculaNoValida(){
        System.out.println("La pelicula ingresada no fue encontrada, intente de nuevo");
        return null;
    }

    static private Boolean clasificacionValida(PeliculaResponse nuevaPelicula){
        //TODO
        return true;
    }
}
