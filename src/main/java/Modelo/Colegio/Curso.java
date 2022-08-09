package Modelo.Colegio;

import Servicios.Pelicula.APIPelicula.PeliculaResponse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@DiscriminatorValue("Curso")
public class Curso extends Votante{



    @Transient
    ArrayList<Alumno> alumnos;

    Double grado;

    public Curso Curso() {return new Curso();}

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> votantes) {
        this.alumnos = votantes;
    }

    public void addAlumno(Alumno alumno){
        if(alumno.getGrado() == this.getGrado()) alumnos.add(alumno);
        else System.out.println("El alumno no es del grado de este curso");
    }

    public Double getGrado() {
        return grado;
    }

    public void setGrado(Double grado) {
        this.grado = grado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Double getPromedio() {
        return promedio;
    }

    @Override
    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public void cargarParametros(List<Object> parametros){
        this.nombre = (String) parametros.get(0);
        this.promedio = (Double) parametros.get(1);
        this.grado = (Double) parametros.get(2);
        this.alumnos = (ArrayList<Alumno>) parametros.get(3);
    }

    public boolean esDestacado(){
        return promedio > (Double) 7.0 && alumnos.stream().filter(alumno -> alumno.esAbanderado()).count() > 2;
    }
}
