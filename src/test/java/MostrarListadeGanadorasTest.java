import Modelo.Colegio.Colegio;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
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
        PeliculaRequest peliculaRequest = new PeliculaRequest("Encanto", "2021");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosAlumno, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
    }

    public void cargarCaso3() throws Exception {
        List<Object> parametrosCurso = new CrearVotanteTest().cargarParametrosCurso();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Big Hero 6", "2014");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosCurso, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
    }

    public void cargarCaso4() throws Exception {
        List<Object> parametrosGraduado = new CrearVotanteTest().cargarParametrosGraduado();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Spirited Away", "2001");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosGraduado, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
    }

    //Estrategia Alumno Destacado
    @Test
    public void puntuarCaso1() throws Exception {
        cargarCaso1();
    }

    //Estrategia Alumno no destacado
    @Test
    public void puntuarCaso2() {

    }

    //estrategia Curso
    @Test
    public void puntuarCaso3() {

    }

    //Estrategia Graduado
    @Test
    public void puntuarCaso4(){

    }


    public void mostrarGanadorasTest(){

    }
}
