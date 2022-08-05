import Servicios.Pelicula.APIPelicula.APIPeliculaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class PeliculaResponseTest {

    @Test
    public void testDevuelvePelicula() throws Exception {

        APIPeliculaService peliculaService = new APIPeliculaService();
        Assertions.assertDoesNotThrow(()->peliculaService.buscarPelicula("The Batman","2022"));
    }

}
