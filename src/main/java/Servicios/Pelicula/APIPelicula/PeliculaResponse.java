package Servicios.Pelicula.APIPelicula;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class PeliculaResponse {
    @Id @GeneratedValue
    int id;
    String nombrePelicula;
    int anio;
    String clasificacion;

    ArrayList<String> paisesOrigen;
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
