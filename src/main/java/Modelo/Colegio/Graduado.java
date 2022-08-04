package Modelo.Colegio;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.Entity;

@Entity
public class Graduado extends Votante{

    public Graduado() {}
    public Graduado(String nombre, Votacion peliculaVotada, Double promedio, boolean pagaAportes) {

        super(nombre, peliculaVotada, promedio);
        this.pagaAportes = pagaAportes;
    }

    String nombre;
    String id;
    Double promedio;
    boolean pagaAportes;
    Votacion peliculaVotada;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public boolean getPagaAportes() {
        return pagaAportes;
    }

    public void setPagaAportes(boolean pagaAportes) {
        this.pagaAportes = pagaAportes;
    }

    public Votacion getPeliculaVotada() {
        return peliculaVotada;
    }

    public void setPeliculaVotada(Votacion peliculaVotada) {
        this.peliculaVotada = peliculaVotada;
    }

}
