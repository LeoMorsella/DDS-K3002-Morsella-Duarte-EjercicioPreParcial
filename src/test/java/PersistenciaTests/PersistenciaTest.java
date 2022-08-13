package PersistenciaTests;

import Modelo.Colegio.*;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.APIPelicula.APIPeliculaService;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;
import Servicios.Votacion.RealizarVotacion;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import java.util.List;

public class PersistenciaTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

    @After
    public void rollBack() {
        rollbackTransaction();
    }

    @Test
    public void setDatabase() throws Exception {

        //Set de votantes
        Alumno alumno = new Alumno();
        alumno.setNombre("AlumnoTest");
        alumno.setPromedio(7.5);
        alumno.setEsAbanderado(false);
        alumno.setGrado(4.0);
        entityManager().persist(alumno);

        Graduado graduado = new Graduado();
        graduado.setNombre("GraduadoTest");
        graduado.setPromedio(8.0);
        graduado.setPagaAportes(true);
        entityManager().persist(graduado);

        Curso curso = new Curso();
        curso.setGrado(4.0);
        entityManager().persist(curso);


        //Set de peliculas
        APIPeliculaService apiPeliculaService = new APIPeliculaService();

        PeliculaResponse pelicula1 = apiPeliculaService.buscarPelicula("The Batman","2022");
        PeliculaResponse pelicula2 = apiPeliculaService.buscarPelicula("Labyrinth","1986");
        entityManager().persist(pelicula1);
        entityManager().persist(pelicula2);


        //Set votaciones

        Votacion votacion1 = new Votacion(pelicula2,alumno);
        entityManager().persist(votacion1);

        PeliculaRequest peli = new PeliculaRequest("Moonfall","2022");
        RealizarVotacion.generarVotacion(peli,graduado);

        commitTransaction();


    }

    @Test
    public void QueryObtenerVotante() throws Exception {
        Repositorio repositorio = new Repositorio();
    //setDatabase();
        List<Votante> votantes = repositorio.getVotantes();

        Assert.assertEquals(3,votantes.size());
    }



    @Test
    public void QueryObtenerGraduados() throws Exception {
        Repositorio repositorio = new Repositorio();
      //  setDatabase();
        List<Graduado> graduados = repositorio.getGraduados();

        Assert.assertEquals(1,graduados.size());
    }

    @Test
    public void QueryObtenerCursos() throws Exception {
        Repositorio repositorio = new Repositorio();
       // setDatabase();
        List<Curso> cursos = repositorio.getCursos();

        Assert.assertEquals(1,cursos.size());
    }

    @Test
    public void QueryObtenerPeliculas() throws Exception {
        Repositorio repositorio = new Repositorio();
       // setDatabase();
        List<PeliculaResponse> peliculas = repositorio.getPeliculas();
        Assert.assertEquals(3,peliculas.size());
    }

    @Test
    public void QueryObtenerVotaciones() throws Exception {
        Repositorio repositorio = new Repositorio();
     //   setDatabase();
        List<Votacion> votacions = repositorio.getVotaciones();
        //List<Votacion> v = entityManager().createQuery("FROM Votacion").getResultList();
        Assert.assertEquals(2,votacions.size());
    }

    @Test
    public  void QueryAlumnos() throws Exception {
        Repositorio repositorio = new Repositorio();
        List<Alumno> alumnos = repositorio.getAlumnos();

        Assert.assertEquals(1,alumnos.size());
    }

}
