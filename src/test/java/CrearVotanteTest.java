import Modelo.Colegio.Colegio;
import Modelo.Colegio.Votante;
import Servicios.Votacion.CrearVotante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CrearVotanteTest {

    Colegio colegioDePrueba = new Colegio();
    List<Object> parametrosAlumn = new ArrayList<>();
    List<Object> parametrosCurso = new ArrayList<>();
    List<Object> parametrosGraduado = new ArrayList<>();

    @Test
    public void crearAlumnoTest(){
        parametrosAlumn.add("juan");
        parametrosAlumn.add(8.6);
        parametrosAlumn.add(4.0);
        parametrosAlumn.add(false);
        Assertions.assertDoesNotThrow(()->CrearVotante.crearVotante("alumno", parametrosAlumn, colegioDePrueba));
        System.out.println(CrearVotante.crearVotante("alumno", parametrosAlumn, colegioDePrueba));
    }

}
