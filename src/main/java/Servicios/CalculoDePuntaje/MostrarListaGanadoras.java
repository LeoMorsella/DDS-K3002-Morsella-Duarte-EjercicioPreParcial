package Servicios.CalculoDePuntaje;

import Modelo.Colegio.RepoVotaciones;
import Modelo.Colegio.Votacion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostrarListaGanadoras {


    static public List<Votacion> mostrarLista() throws IOException{

        List<Votacion> votaciones = RepoVotaciones.getRepo().getVotaciones();

        List<Double> puntuaciones = votaciones.stream()
                .map(votacion -> {
                    try {
                        return PuntajeService.calcularPuntaje(votacion);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        List<Votacion> ganadoras = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            Votacion votacion = votaciones.get(i);
            if(puntuaciones.contains(PuntajeService.calcularPuntaje(votacion))) {
                ganadoras.add(votacion);
                System.out.println(votacion.getPelicula().getTitle());
            }
        }

        return ganadoras;
    }
}
