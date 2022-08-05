package Servicios.CalculoDePuntaje;

import Servicios.Pelicula.APIPelicula.PeliculaResponse;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PuntajePeliculaService {

   /* static public double puntuarPelicula(PeliculaResponse pelicula) throws IOException {
        return puntuarOrigen(pelicula.getPaisesOrigen()) + puntuarIdioma(pelicula.getIdiomas());
    }*/

    static private double puntuarOrigen(List<String> origen) throws IOException {
        List<String> paisesLatinos= getPaisesLatinos();

        if(origen.stream().anyMatch( pais -> pais.equals("Argentina"))) return 20;
        else if (origen.stream().anyMatch(paisesLatinos::contains)) return 10;
        else return 0;
    }

    static private double puntuarIdioma(List<String> idiomas){
        if(idiomas.stream().anyMatch(idioma -> idioma == "Spanish")) return 20;
        return 0;
    }
    static private List<String> getPaisesLatinos() throws IOException {

        List<String> paises = new ArrayList<>();
        String paisTemp = "";

        File doc = new File("PaisesLatinos.txt");
        doc.createNewFile();
        FileReader freader = new FileReader(doc);
        char [] i = new char[1000];
        freader.read(i);
        for(char j : i) {
            paisTemp += j;
            if(j == ' '){
                paises.add(paisTemp);
                paisTemp = "";
            }
        }
        freader.close();
        return paises;

    }
}
