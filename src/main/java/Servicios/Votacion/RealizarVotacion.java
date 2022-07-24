package Servicios.Votacion;

import Modelo.Colegio.RepoVotaciones;
import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.Pelicula;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;
import Servicios.Pelicula.ValidarPelicula;

import javax.xml.validation.Validator;

public class RealizarVotacion {

    public void realizarVotacion(Pelicula pelicula, Votante votante)throws Exception{
        PeliculaResponse peliculaVotada = ValidarPelicula.validarPelicula(pelicula);
        if(peliculaVotada!=null){
            Votacion nuevaVotacion = new Votacion(peliculaVotada, votante);
            //Despues esto se cambia con hibernate
            RepoVotaciones repoVotaciones = new RepoVotaciones();
            repoVotaciones.getVotaciones().add(nuevaVotacion);
            //hasta aca
            }

    }

}
