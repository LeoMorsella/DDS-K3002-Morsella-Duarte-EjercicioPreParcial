package Servicios.Pelicula.APIPelicula;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;

public class APIPeliculaService {

    public PeliculaResponse buscarPelicula(String pelicula, String anio) throws Exception {
        WebClient clientUsers = WebClient.create("http://www.omdbapi.com/?t="+pelicula+"&y="+anio);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        Response response = clientUsers
                .header("Content-Type", "application/json")
                .get();

        PeliculaResponse newPelicula;
        int status = response.getStatus();
        System.out.println("Status: " + status);
        String responseBody = response.readEntity(String.class);
        if (status == 200) {
            newPelicula = objectMapper.readValue(responseBody,PeliculaResponse.class);
            System.out.println("Titulo: "+newPelicula.getNombrePelicula());
            System.out.println("Año: "+newPelicula.getAnio());
            System.out.println("Clasificacion: "+newPelicula.getClasificacion());
            System.out.println("Paises Origen: "+newPelicula.getPaisesOrigen());
            System.out.println("Idiomas: "+newPelicula.getIdiomas());
            return newPelicula;
        }
        else{
            System.out.println("Error Response = " + responseBody);
            throw new Exception("Error en la llamada a /api/user");
        }
    }
}
