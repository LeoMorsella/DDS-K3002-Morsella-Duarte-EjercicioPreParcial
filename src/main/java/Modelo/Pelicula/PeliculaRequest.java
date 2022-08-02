package Modelo.Pelicula;

public class PeliculaRequest {

    int id;
    String nombre;
    String año;

    public String getNombre() {
        return nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
