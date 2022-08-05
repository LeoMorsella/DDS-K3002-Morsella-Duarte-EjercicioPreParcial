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

   String title;
   String year;
   String rated;
   String language;
   String country;

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getRated() {
        return rated;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public void setTitle(String title) {
        title = title;
    }

    public void setYear(String year) {
        year = year;
    }

    public void setRated(String rated) {
        rated = rated;
    }

    public void setLanguage(String language) {
        language = language;
    }

    public void setCountry(String country) {
        country = country;
    }
}
