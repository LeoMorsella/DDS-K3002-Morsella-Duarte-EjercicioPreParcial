package Servicios.Votacion;

import Modelo.Colegio.RepoVotaciones;
import Modelo.Colegio.Repositorio;
import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;
import Servicios.Pelicula.ValidarPelicula;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

public class RealizarVotacion   {

    public static void nuevaVotacion(PeliculaRequest pelicula, Votante votante)throws Exception{
        if(votante.getPeliculaVotada() != null) {
            System.out.println("Este votante ya eligió su pelicula");
            throw new Exception();
        }
        generarVotacion(pelicula, votante);
    }

    static public void modificarVotacion(PeliculaRequest pelicula, Votante votante) throws Exception{
        if(votante.getPeliculaVotada() == null) {
            System.out.println("Este votante no eligió una pelicula aun");
            throw new Exception();
        }
        generarVotacion(pelicula, votante);
    }

    static public void generarVotacion(PeliculaRequest pelicula, Votante votante) throws Exception{
        PeliculaResponse peliculaVotada = ValidarPelicula.validarPelicula(pelicula);
        if(peliculaVotada!=null){
            Votacion nuevaVotacion = new Votacion(peliculaVotada, votante);
            votante.setPeliculaVotada(nuevaVotacion);
            //Repositorio repo = new Repositorio();
            //repo.persistirVotacion(nuevaVotacion);


            RepoVotaciones repoVotaciones = RepoVotaciones.getRepo();
            repoVotaciones.getVotaciones().add(nuevaVotacion);
            repoVotaciones.persistirVotaciones();

        }
    }
}
