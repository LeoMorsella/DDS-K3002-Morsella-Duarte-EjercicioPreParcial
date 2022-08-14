package Modelo.Colegio;

import Modelo.Pelicula.PeliculaResponse;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import java.util.List;

public class Repositorio implements WithGlobalEntityManager {

    static Repositorio instance = null;


    public List<Votante> getVotantes() {
        return entityManager().createQuery("FROM Votante").getResultList();
    }

    public List<Alumno> getAlumnos() {
        return entityManager().createQuery("FROM Votante WHERE tipo_votante = Alumno").getResultList();
    }

    public List<Graduado> getGraduados() {
        return entityManager().createQuery("FROM Votante WHERE tipo_votante = Graduado").getResultList();
    }

    public List<Curso> getCursos() {
        return entityManager().createQuery("FROM Votante WHERE tipo_votante = Curso").getResultList();
    }

    public List<PeliculaResponse> getPeliculas() {
        return entityManager().createQuery("FROM PeliculaResponse").getResultList();
    }

    public List<Votacion> getVotaciones() {
        return entityManager().createQuery("FROM Votacion").getResultList();
    }

    public void persistirVotacion(Votacion votacion) {
        entityManager().persist(votacion);
    }
    public void persistirVotante(Votante votante) {
        entityManager().persist(votante);
    }
    public void persistirPelicula(PeliculaResponse peliculaResponse) {
        entityManager().persist(peliculaResponse);
    }
}
