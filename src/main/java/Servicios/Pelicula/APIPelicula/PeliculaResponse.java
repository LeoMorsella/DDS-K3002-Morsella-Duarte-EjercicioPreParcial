package Servicios.Pelicula.APIPelicula;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class PeliculaResponse {
    @Id @GeneratedValue
    int id;

   @JsonProperty("Title")
   String Title = "";
   @JsonProperty("Year")
   String Year = "";
   @JsonProperty("Rated")
   String Rated = "";
   @JsonProperty("Language")
   String Language = "";
   @JsonProperty("Country")
   String Country = "";

    public String getTitle() {
        return Title;
    }

    public String getYear() {
        return Year;
    }

    public String getRated() {
        return Rated;
    }

    public String getLanguage() {
        return Language;
    }

    public String getCountry() {
        return Country;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setRated(String rated) {
        Rated = rated;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
