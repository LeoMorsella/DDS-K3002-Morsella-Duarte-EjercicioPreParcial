import Modelo.Colegio.*;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.APIPelicula.APIPeliculaService;
import Servicios.Pelicula.APIPelicula.PeliculaResponse;
import Servicios.Pelicula.ValidarPelicula;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class PeliculaResponseTest {

    @Test
    public void testDevuelvePelicula() throws Exception {

        APIPeliculaService peliculaService = new APIPeliculaService();
        Assertions.assertDoesNotThrow(()->peliculaService.buscarPelicula("The Batman","2022"));
    }

    @Test
    public void testRealizarVotacion() throws Exception{
        PeliculaRequest pelicula = new PeliculaRequest("The Batman","2022");
        PeliculaResponse peliculaR = ValidarPelicula.validarPelicula(pelicula);






    }

}
