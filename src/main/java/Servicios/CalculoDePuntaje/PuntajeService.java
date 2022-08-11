package Servicios.CalculoDePuntaje;

import Modelo.Colegio.*;
import Servicios.CalculoDePuntaje.Strategies.EstrategiaAlumno;
import Servicios.CalculoDePuntaje.Strategies.EstrategiaCurso;
import Servicios.CalculoDePuntaje.Strategies.EstrategiaGraduado;

import java.io.IOException;

public class PuntajeService {

    public static double calcularPuntaje(Votacion votacion) throws IOException {
        PuntajeVotadorService puntajeVotadorService = new PuntajeVotadorService();
        Votante votante = votacion.getVotante();
        if(votante.getClass() == Alumno.class)
            puntajeVotadorService.setEstrategiaVotacion(new EstrategiaAlumno());
        if(votante.getClass() == Graduado.class)
            puntajeVotadorService.setEstrategiaVotacion(new EstrategiaGraduado());
        if (votante.getClass() == Curso.class)
            puntajeVotadorService.setEstrategiaVotacion(new EstrategiaCurso());
        return PuntajePeliculaService.puntuarPelicula(votacion.getPelicula())
                + puntajeVotadorService.puntuarVotante(votante);
    }
}
