package ServiceTests;

import Servicios.Votacion.MostrarRecomendacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MostrarRecomTest {

@Test
    public void mostrarRecomTest() throws Exception {
        (new CargarCasos()).cargarCaso1();
        (new CargarCasos()).cargarCaso2();
        (new CargarCasos()).cargarCaso3();
        (new CargarCasos()).cargarCaso4();
        (new CargarCasos()).cargarCaso5();
        Assertions.assertDoesNotThrow(MostrarRecomendacion::mostrarRecomendacion);
    }
}