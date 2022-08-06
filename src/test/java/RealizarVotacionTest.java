import Modelo.Colegio.Colegio;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.APIPelicula.APIPeliculaService;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;
import Servicios.Pelicula.ValidarPelicula;
import Servicios.Votacion.CrearVotante;
import Servicios.Votacion.RealizarVotacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RealizarVotacionTest {

    @Test
    public void nuevaVotacionTest(){
        List<Object> parametrosAlumno = new CrearVotanteTest().cargarParametrosAlumno1();
        PeliculaRequest peliculaRequest = new PeliculaRequest("The Batman", "2022");
        Colegio colegioPrueba = new Colegio();
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosAlumno, colegioPrueba);
        Assertions.assertDoesNotThrow(() -> RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante));
    }

    @Test
    public void modificarVotacionDeVotadorQueNoVoto(){
        List<Object> parametrosGraduado = new CrearVotanteTest().cargarParametrosGraduado();
        PeliculaRequest peliculaRequest = new PeliculaRequest("The Batman", "2022");
        Colegio colegioPrueba = new Colegio();
        Votante nuevoVotante = CrearVotante.crearVotante("graduado", parametrosGraduado, colegioPrueba);
        Assertions.assertThrows(Exception.class, () -> RealizarVotacion.modificarVotacion(peliculaRequest, nuevoVotante));
    }


}
