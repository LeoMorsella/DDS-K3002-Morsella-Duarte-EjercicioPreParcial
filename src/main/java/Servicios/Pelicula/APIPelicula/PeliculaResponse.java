package Servicios.Pelicula.APIPelicula;

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

}
