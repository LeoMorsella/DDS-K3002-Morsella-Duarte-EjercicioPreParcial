package Servicios.Pelicula.APIPelicula;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;

public class APIPeliculaService {

    public PeliculaResponse buscarPelicula(String pelicula, String anio) throws Exception {
        WebClient clientUsers = WebClient.create("http://www.omdbapi.com/?apikey=331b0ca1&t="+pelicula+"&y="+anio);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        Response response = clientUsers
                .header("Content-Type", "application/json")
                .get();

        int status = response.getStatus();
        System.out.println("Status: " + status);
        String responseBody = response.readEntity(String.class);
        if (status == 200) {
            System.out.println("response =" + responseBody);
            PeliculaResponse newPelicula = objectMapper.readValue(responseBody,PeliculaResponse.class);
            System.out.println("Titulo: "+ newPelicula.getTitle());
            System.out.println("Year: "+newPelicula.getYear());
            System.out.println("Rated: "+newPelicula.getRated());
            System.out.println("Country: "+newPelicula.getCountry());
            System.out.println("Language: "+newPelicula.getLanguage());
            return newPelicula;
        }
        else{
            System.out.println("Error Response = " + responseBody);
            throw new Exception("Error en la llamada a /api/user");
        }
    }
}
