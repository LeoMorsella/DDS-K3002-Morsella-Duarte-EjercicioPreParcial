package Modelo.Colegio;

import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import java.util.List;

public class Repositorio implements WithGlobalEntityManager {
    public List<Votante> getVotantes() {
        return entityManager().createQuery("FROM Votante").getResultList();
    }

    public List<PeliculaResponse> getPeliculas() {
        return entityManager().createQuery("FROM PeliculaResponse").getResultList();
    }
}
