import Modelo.Pelicula.PeliculaRequest;
import Servicios.Pelicula.APIPelicula.APIPeliculaService;
import Servicios.Pelicula.ValidarPelicula;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class PeliculaAPITest {

    @Test
    public void testPeliculaValida() throws Exception {
        APIPeliculaService peliculaService = new APIPeliculaService();
        Assertions.assertDoesNotThrow(()->peliculaService.buscarPelicula("The Batman","2022"));
    }

    @Test
    public void testPeliculaNoEncontrada() throws Exception {
        APIPeliculaService peliculaService = new APIPeliculaService();
        Assertions.assertThrows(Exception.class, () -> peliculaService.buscarPelicula("PeliculaFalsa", "2050"));
    }

    @Test
    public void testPeliculaConRaitingInvalido() throws Exception {
        APIPeliculaService peliculaService = new APIPeliculaService();
        PeliculaRequest pelicula = new PeliculaRequest("American Pie", "1999");
        Assertions.assertThrows(Exception.class, () -> ValidarPelicula.validarPelicula(pelicula));
    }

}
