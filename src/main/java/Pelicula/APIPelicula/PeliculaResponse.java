package Pelicula.APIPelicula;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.ArrayList;

//@Entity
public class PeliculaResponse {
    String nombrePelicula;
    int anio;
    String clasificacion;
   // @ElementCollection
    ArrayList<String> paisesOrigen;
   // @ElementCollection
    ArrayList<String> idiomas;

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public int getAnio() {
        return anio;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public ArrayList<String> getPaisesOrigen() {
        return paisesOrigen;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setPaisesOrigen(ArrayList<String> paisesOrigen) {
        this.paisesOrigen = paisesOrigen;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
}
