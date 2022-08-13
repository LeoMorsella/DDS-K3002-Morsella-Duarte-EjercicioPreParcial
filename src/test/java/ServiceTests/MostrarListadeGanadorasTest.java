package ServiceTests;

import Modelo.Colegio.Colegio;
import Modelo.Colegio.RepoVotaciones;
import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.CalculoDePuntaje.MostrarListaGanadoras;
import Servicios.CalculoDePuntaje.PuntajeService;
import Servicios.Pelicula.ValidarPelicula;
import Servicios.Votacion.CrearVotante;
import Servicios.Votacion.RealizarVotacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import java.util.List;

//No correr todos los tests juntos, ya que cada test funciona con el primer elemento de la lista del repo
public class MostrarListadeGanadorasTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

    //Estrategia Alumno Destacado, este valor debe dar 94,4 por la configuracion del alumno y la pelicula
    @Test
    public void puntuarCaso1() throws Exception {
        CargarCasos cargarCasos = new CargarCasos();
        cargarCasos.cargarCaso1();
        Assertions.assertEquals(94.4, PuntajeService.calcularPuntaje(cargarCasos.nuevaVotacion));
    }

    //Estrategia Alumno no destacado, debería dar 60
    @Test
    public void puntuarCaso2() throws Exception {
        CargarCasos cargarCasos = new CargarCasos();
        cargarCasos.cargarCaso2();
        Assertions.assertEquals(60, PuntajeService.calcularPuntaje(cargarCasos.nuevaVotacion));
    }

    //estrategia Curso, debería dar 17,2
    @Test
    public void puntuarCaso3() throws Exception {
        CargarCasos cargarCasos = new CargarCasos();
        cargarCasos.cargarCaso3();
        Assertions.assertEquals(17.2, PuntajeService.calcularPuntaje(cargarCasos.nuevaVotacion));
    }

    //Estrategia Graduado, debería dar 28,6
    @Test
    public void puntuarCaso4() throws Exception {
        CargarCasos cargarCasos = new CargarCasos();
        cargarCasos.cargarCaso4();
        Assertions.assertEquals(28.6, PuntajeService.calcularPuntaje(cargarCasos.nuevaVotacion));
    }

    //debería mostrar los primeros 4 casos
    @Test
    public void mostrarGanadorasTest() throws Exception {
        RepoVotaciones repoV = RepoVotaciones.getRepo();
        (new CargarCasos()).cargarCaso1();
        (new CargarCasos()).cargarCaso2();
        (new CargarCasos()).cargarCaso3();
        (new CargarCasos()).cargarCaso4();
        (new CargarCasos()).cargarCaso5();
        Assertions.assertDoesNotThrow(() -> MostrarListaGanadoras.mostrarLista());
    }
}
