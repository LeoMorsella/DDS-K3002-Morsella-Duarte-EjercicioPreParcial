package Modelo.Pelicula;

public class PeliculaRequest {

    int id;
    String nombre;
    String anio;

    public PeliculaRequest(String nombre, String anio) {
        this.nombre = nombre;
        this.anio = anio;
    }
    public String getNombre() {
        return nombre;
    }

    public String getanio() {
        return anio;
    }

    public void setAño(String año) {
        this.anio = año;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
