package Servicios.Pelicula;

import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.APIPelicula.APIPeliculaService;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;

public class ValidarPelicula {


    static public PeliculaResponse validarPelicula(PeliculaRequest pelicula) throws Exception {
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

    // Debe indicar que si para mayor de edad, debe lanzar un mensaje de error
    static private Boolean clasificacionValida(PeliculaResponse nuevaPelicula){
        //TODO
        return true;
    }
}
