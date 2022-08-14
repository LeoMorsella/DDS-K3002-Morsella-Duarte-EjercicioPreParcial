package ServiceTests;

import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.Votacion.CrearVotante;
import Servicios.Votacion.RealizarVotacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RealizarVotacionTest {

    @Test
    public void nuevaVotacionTest(){
        List<Object> parametrosAlumno = CargarCasos.cargarParametrosAlumno1();
        PeliculaRequest peliculaRequest = new PeliculaRequest("The Batman", "2022");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosAlumno);
        Assertions.assertDoesNotThrow(() -> RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante));
    }

    @Test
    public void modificarVotacionDeVotadorQueNoVoto(){
        List<Object> parametrosGraduado = CargarCasos.cargarParametrosGraduado1();
        PeliculaRequest peliculaRequest = new PeliculaRequest("The Batman", "2022");
        Votante nuevoVotante = CrearVotante.crearVotante("graduado", parametrosGraduado);
        Assertions.assertThrows(Exception.class, () -> RealizarVotacion.modificarVotacion(peliculaRequest, nuevoVotante));
    }


}
