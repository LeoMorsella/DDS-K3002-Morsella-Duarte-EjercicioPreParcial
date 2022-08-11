package ServiceTests;

import Modelo.Colegio.Colegio;
import Modelo.Colegio.RepoVotaciones;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.CalculoDePuntaje.MostrarListaGanadoras;
import Servicios.CalculoDePuntaje.PuntajeService;
import Servicios.Votacion.CrearVotante;
import Servicios.Votacion.RealizarVotacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MostrarListadeGanadorasTest {

    Colegio colegioPrueba = new Colegio();

    public void cargarCaso1() throws Exception {
        List<Object> parametrosAlumno = new CrearVotanteTest().cargarParametrosAlumno1();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Underdogs", "2013");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosAlumno, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
    }

    public void cargarCaso2() throws Exception {
        List<Object> parametrosAlumno = new CrearVotanteTest().cargarParametrosAlumno2();
        PeliculaRequest peliculaRequest = new PeliculaRequest("A movie of eggs", "2006");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosAlumno, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
    }

    public void cargarCaso3() throws Exception {
        List<Object> parametrosCurso = new CrearVotanteTest().cargarParametrosCurso();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Big Hero 6", "2014");
        Votante nuevoVotante = CrearVotante.crearVotante("curso", parametrosCurso, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
    }

    public void cargarCaso4() throws Exception {
        List<Object> parametrosGraduado = new CrearVotanteTest().cargarParametrosGraduado1();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Spirited Away", "2001");
        Votante nuevoVotante = CrearVotante.crearVotante("graduado", parametrosGraduado, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
    }

    public void cargarCaso5() throws Exception {
        List<Object> parametrosGraduado = new CrearVotanteTest().cargarParametrosGraduado2();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Home Alone", "1990");
        Votante nuevoVotante = CrearVotante.crearVotante("graduado", parametrosGraduado, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
    }

    //Estrategia Alumno Destacado, este valor debe dar 94,4 por la configuracion del alumno y la pelicula
    @Test
    public void puntuarCaso1() throws Exception {
        RepoVotaciones repoV = RepoVotaciones.getRepo();
        cargarCaso1();
        Assertions.assertEquals(94.4, PuntajeService.calcularPuntaje(repoV.getVotaciones().get(0)));
    }

    //Estrategia Alumno no destacado, debería dar 60
    @Test
    public void puntuarCaso2() throws Exception {
        RepoVotaciones repoV = RepoVotaciones.getRepo();
        cargarCaso2();
        Assertions.assertEquals(60, PuntajeService.calcularPuntaje(repoV.getVotaciones().get(0)));
    }

    //estrategia Curso, debería dar 17,2
    @Test
    public void puntuarCaso3() throws Exception {
        RepoVotaciones repoV = RepoVotaciones.getRepo();
        cargarCaso3();
        Assertions.assertEquals(17.2,  PuntajeService.calcularPuntaje(repoV.getVotaciones().get(0)));
    }

    //Estrategia Graduado, debería dar 28,6
    @Test
    public void puntuarCaso4() throws Exception {
        RepoVotaciones repoV = RepoVotaciones.getRepo();
        cargarCaso4();
        Assertions.assertEquals(28.6, PuntajeService.calcularPuntaje(repoV.getVotaciones().get(0)));
    }

    //debería mostrar los primeros 4 casos
    @Test
    public void mostrarGanadorasTest() throws Exception {
        RepoVotaciones repoV = RepoVotaciones.getRepo();
        cargarCaso1();
        cargarCaso2();
        cargarCaso3();
        cargarCaso4();
        cargarCaso5();
        Assertions.assertDoesNotThrow(() -> MostrarListaGanadoras.mostrarLista());
    }
}
