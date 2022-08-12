package Modelo.Colegio;

import Modelo.Pelicula.PeliculaResponse;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import javax.persistence.EntityTransaction;
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

    public void persistir(Object objeto) {
        startTransaccion();
        entityManager().persist(objeto);
        commit();
    }

    public void startTransaccion(){
        EntityTransaction tx = entityManager().getTransaction();
        if (!tx.isActive()) {
            tx.begin();
        }
    }

    public void commit(){
        EntityTransaction tx = entityManager().getTransaction();
        if (!tx.isActive()) {
            tx.commit();
        }
    }
}
