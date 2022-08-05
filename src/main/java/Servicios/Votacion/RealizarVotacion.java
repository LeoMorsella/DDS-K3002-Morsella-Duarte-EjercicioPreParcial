package Servicios.Votacion;

import Modelo.Colegio.RepoVotaciones;
import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;
import Servicios.Pelicula.ValidarPelicula;

public class RealizarVotacion {

    public void nuevaVotacion(PeliculaRequest pelicula, Votante votante)throws Exception{
        if(votante.getPeliculaVotada() != null) {
            System.out.println("Este votante ya eligió su pelicula");
            throw new Exception();
        }
        generarVotacion(pelicula, votante);
    }

    public void modificarVotacion(PeliculaRequest pelicula, Votante votante) throws Exception{
        if(votante.getPeliculaVotada() == null) {
            System.out.println("Este votante no eligió una pelicula aun");
            throw new Exception();
        }
        generarVotacion(pelicula, votante);
    }

    public void generarVotacion(PeliculaRequest pelicula, Votante votante) throws Exception{
        PeliculaResponse peliculaVotada = ValidarPelicula.validarPelicula(pelicula);
        if(peliculaVotada!=null){
            Votacion nuevaVotacion = new Votacion(peliculaVotada, votante);
            votante.setPeliculaVotada(nuevaVotacion);
            //Despues esto se cambia con hibernate
            RepoVotaciones repoVotaciones = new RepoVotaciones();
            repoVotaciones.getVotaciones().add(nuevaVotacion);
            //hasta aca
        }
    }
}
