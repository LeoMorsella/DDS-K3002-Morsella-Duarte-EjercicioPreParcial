package Servicios.Pelicula.APIPelicula;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class APIPeliculaService {

    public PeliculaResponse buscarPelicula(String Title, String Year) throws Exception {
        WebClient clientUsers = WebClient.create("http://www.omdbapi.com/?apikey=331b0ca1&t="+Title+"&y="+Year);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        Response response = clientUsers
                .header("Content-Type", "application/json")
                .get();

        int status = response.getStatus();
        System.out.println("Status: " + status);
        String responseBody = response.readEntity(String.class);
        if (!(responseBody.contains("Movie not found!"))) {
            System.out.println("response =" + responseBody);
            PeliculaResponse newPelicula = objectMapper.readValue(responseBody,PeliculaResponse.class);
            System.out.println("Titulo: "+ newPelicula.getTitle());
            System.out.println("Año: "+newPelicula.getYear());
            System.out.println("Clasificacion: "+newPelicula.getRated());
            System.out.println("Pais: "+newPelicula.getCountry());
            System.out.println("Idioma: "+newPelicula.getLanguage());
            return newPelicula;
        }
        else{
            System.out.println("Error Response = " + responseBody);
            throw new Exception("Error en la llamada a /api/user");
        }
    }

}
