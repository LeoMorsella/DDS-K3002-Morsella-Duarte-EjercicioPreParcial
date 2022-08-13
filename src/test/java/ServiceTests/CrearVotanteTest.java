package ServiceTests;

import Modelo.Colegio.Colegio;
import Servicios.Votacion.CrearVotante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CrearVotanteTest {

    Colegio colegioDePrueba = new Colegio();
    @Test
    public void crearAlumnoTest(){
        List<Object> parametrosAlumn = CargarCasos.cargarParametrosAlumno1();
        Assertions.assertDoesNotThrow(()->CrearVotante.crearVotante("alumno", parametrosAlumn, colegioDePrueba));
    }

    @Test
    public void crearCursoTest(){
        List<Object> parametrosCurso = CargarCasos.cargarParametrosCurso();
        Assertions.assertDoesNotThrow(()->CrearVotante.crearVotante("curso", parametrosCurso, colegioDePrueba));
    }

    @Test
    public void crearGraduadoTest(){
        List<Object> parametrosGraduado = CargarCasos.cargarParametrosGraduado1();
        Assertions.assertDoesNotThrow(()->CrearVotante.crearVotante("graduado", parametrosGraduado, colegioDePrueba));
    }

}
