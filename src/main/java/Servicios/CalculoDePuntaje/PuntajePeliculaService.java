package Servicios.CalculoDePuntaje;

import Modelo.Pelicula.PeliculaResponse;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PuntajePeliculaService {

    static public double puntuarPelicula(PeliculaResponse pelicula) throws IOException {
        return puntuarOrigen(pelicula.getCountry()) + puntuarIdioma(pelicula.getLanguage());
    }

    static private List<String> separarPorComas(String cadena){
        return Arrays.asList(cadena.split("\\s*,\\s*"));
    }

    static private double puntuarOrigen(String origen) throws IOException {
        List<String> paisesLatinos= getPaisesLatinos();
        List <String> origenLista = separarPorComas(origen);

        if(origenLista.stream().anyMatch( pais -> pais.equals("Argentina"))) return 20;
        else if (origenLista.stream().anyMatch(pais -> paisesLatinos.contains(pais +" "))) return 10;
        else return 0;
    }

    static private double puntuarIdioma(String idiomas){
        List <String> idiomasLista = separarPorComas(idiomas);

        if(idiomasLista.contains("Spanish")) return 20;
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
