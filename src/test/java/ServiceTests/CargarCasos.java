package ServiceTests;

import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.ValidarPelicula;
import Servicios.Votacion.CrearVotante;
import Servicios.Votacion.RealizarVotacion;

import java.util.ArrayList;
import java.util.List;

public class CargarCasos {

    Votacion nuevaVotacion;
    static public List<Object> cargarParametrosAlumno1(){
        List<Object> parametrosAlumn = new ArrayList<>();
        parametrosAlumn.add("juan");
        parametrosAlumn.add(8.6);
        parametrosAlumn.add(4.0);
        parametrosAlumn.add(true);
        return parametrosAlumn;
    }

    static public List<Object> cargarParametrosAlumno2(){
        List<Object> parametrosAlumn = new ArrayList<>();
        parametrosAlumn.add("carla");
        parametrosAlumn.add(7.5);
        parametrosAlumn.add(4.0);
        parametrosAlumn.add(false);
        return parametrosAlumn;
    }

    static public List<Object> cargarParametrosCurso(){
        List<Object> parametrosCurso = new ArrayList<>();
        ArrayList<Votante> alumnos = new ArrayList<>();
        parametrosCurso.add("4toA");
        parametrosCurso.add(8.6);
        parametrosCurso.add(4.0);
        List<Object> parametrosAlumn = cargarParametrosAlumno1();
        Votante alumno1 = CrearVotante.crearVotante("alumno", parametrosAlumn);
        parametrosAlumn.clear();
        parametrosAlumn = cargarParametrosAlumno2();
        Votante alumno2 = CrearVotante.crearVotante("alumno", parametrosAlumn);
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        parametrosCurso.add(alumnos);
        return parametrosCurso;
    }

    static public List<Object> cargarParametrosGraduado1(){
        List<Object> parametrosGraduado = new ArrayList<>();
        parametrosGraduado.add("pedro");
        parametrosGraduado.add(8.6);
        parametrosGraduado.add(true);
        return parametrosGraduado;
    }

    static public List<Object> cargarParametrosGraduado2(){
        List<Object> parametrosGraduado = new ArrayList<>();
        parametrosGraduado.add("andrea");
        parametrosGraduado.add(10.0);
        parametrosGraduado.add(false);
        return parametrosGraduado;
    }

    public void cargarCaso1() throws Exception {
        List<Object> parametrosAlumno = CargarCasos.cargarParametrosAlumno1();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Underdogs", "2013");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosAlumno);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
        nuevaVotacion = new Votacion(ValidarPelicula.validarPelicula(peliculaRequest), nuevoVotante);
    }

    public void cargarCaso2() throws Exception {
        List<Object> parametrosAlumno = CargarCasos.cargarParametrosAlumno2();
        PeliculaRequest peliculaRequest = new PeliculaRequest("A movie of eggs", "2006");
        Votante nuevoVotante = CrearVotante.crearVotante("alumno", parametrosAlumno);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
        nuevaVotacion = new Votacion(ValidarPelicula.validarPelicula(peliculaRequest), nuevoVotante);
    }

    public void cargarCaso3() throws Exception {
        List<Object> parametrosCurso = CargarCasos.cargarParametrosCurso();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Big Hero 6", "2014");
        Votante nuevoVotante = CrearVotante.crearVotante("curso", parametrosCurso);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
        nuevaVotacion = new Votacion(ValidarPelicula.validarPelicula(peliculaRequest), nuevoVotante);
    }

    public void cargarCaso4() throws Exception {
        List<Object> parametrosGraduado = CargarCasos.cargarParametrosGraduado1();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Spirited Away", "2001");
        Votante nuevoVotante = CrearVotante.crearVotante("graduado", parametrosGraduado);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
        nuevaVotacion = new Votacion(ValidarPelicula.validarPelicula(peliculaRequest), nuevoVotante);
    }

    public void cargarCaso5() throws Exception {
        List<Object> parametrosGraduado = CargarCasos.cargarParametrosGraduado2();
        PeliculaRequest peliculaRequest = new PeliculaRequest("Home Alone", "1990");
        Votante nuevoVotante = CrearVotante.crearVotante("graduado", parametrosGraduado);
        RealizarVotacion.nuevaVotacion(peliculaRequest, nuevoVotante);
        nuevaVotacion = new Votacion(ValidarPelicula.validarPelicula(peliculaRequest), nuevoVotante);
    }

}
