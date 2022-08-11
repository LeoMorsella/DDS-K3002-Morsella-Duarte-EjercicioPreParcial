package ServiceTests;

import Modelo.Colegio.Colegio;
import Modelo.Colegio.Votante;
import Servicios.Votacion.CrearVotante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CrearVotanteTest {

    Colegio colegioDePrueba = new Colegio();

    public List<Object> cargarParametrosAlumno1(){
        List<Object> parametrosAlumn = new ArrayList<>();
        parametrosAlumn.add("juan");
        parametrosAlumn.add(8.6);
        parametrosAlumn.add(4.0);
        parametrosAlumn.add(true);
        return parametrosAlumn;
    }

    public List<Object> cargarParametrosAlumno2(){
        List<Object> parametrosAlumn = new ArrayList<>();
        parametrosAlumn.add("carla");
        parametrosAlumn.add(7.5);
        parametrosAlumn.add(4.0);
        parametrosAlumn.add(false);
        return parametrosAlumn;
    }

    public List<Object> cargarParametrosCurso(){
        List<Object> parametrosCurso = new ArrayList<>();
        ArrayList<Votante> alumnos = new ArrayList<>();
        parametrosCurso.add("4toA");
        parametrosCurso.add(8.6);
        parametrosCurso.add(4.0);
        List<Object> parametrosAlumn = cargarParametrosAlumno1();
        Votante alumno1 = CrearVotante.crearVotante("alumno", parametrosAlumn, colegioDePrueba);
        parametrosAlumn.clear();
        parametrosAlumn = cargarParametrosAlumno2();
        Votante alumno2 = CrearVotante.crearVotante("alumno", parametrosAlumn, colegioDePrueba);
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        parametrosCurso.add(alumnos);
        return parametrosCurso;
    }

    public List<Object> cargarParametrosGraduado1(){
        List<Object> parametrosGraduado = new ArrayList<>();
        parametrosGraduado.add("juan");
        parametrosGraduado.add(8.6);
        parametrosGraduado.add(true);
        return parametrosGraduado;
    }

    public List<Object> cargarParametrosGraduado2(){
        List<Object> parametrosGraduado = new ArrayList<>();
        parametrosGraduado.add("andrea");
        parametrosGraduado.add(10.0);
        parametrosGraduado.add(false);
        return parametrosGraduado;
    }
    @Test
    public void crearAlumnoTest(){
        List<Object> parametrosAlumn = cargarParametrosAlumno1();
        Assertions.assertDoesNotThrow(()->CrearVotante.crearVotante("alumno", parametrosAlumn, colegioDePrueba));
    }

    @Test
    public void crearCursoTest(){
        List<Object> parametrosCurso = cargarParametrosCurso();
        Assertions.assertDoesNotThrow(()->CrearVotante.crearVotante("curso", parametrosCurso, colegioDePrueba));
    }

    @Test
    public void crearGraduadoTest(){
        List<Object> parametrosGraduado = cargarParametrosGraduado1();
        Assertions.assertDoesNotThrow(()->CrearVotante.crearVotante("graduado", parametrosGraduado, colegioDePrueba));
    }

}
