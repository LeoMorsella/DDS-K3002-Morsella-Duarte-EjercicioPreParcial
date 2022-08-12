package ServiceTests;

import Modelo.Colegio.Colegio;
import Modelo.Colegio.Repositorio;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.Votacion.CrearVotante;
import Servicios.Votacion.RealizarVotacion;
import org.junit.jupiter.api.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import java.util.ArrayList;
import java.util.List;

public class ListaGanadoresTest extends AbstractPersistenceTest implements WithGlobalEntityManager {
    Colegio colegioPrueba = new Colegio();
    Repositorio repo = new Repositorio();

    @Test
    public void cargarCasos() throws Exception {
        List<Object> parametrosAlumn = new ArrayList<>();
        parametrosAlumn.add("juan");
        parametrosAlumn.add(8.6);
        parametrosAlumn.add(4.0);
        parametrosAlumn.add(true);
        PeliculaRequest peliculaRequest = new PeliculaRequest("Underdogs", "2013");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosAlumn, colegioPrueba);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
        commitTransaction();
    }


}
