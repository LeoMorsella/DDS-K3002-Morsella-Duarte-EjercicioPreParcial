package Servicios.CalculoDePuntaje;

import Modelo.Colegio.RepoVotaciones;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MostrarListaGanadoras {


    public void mostrarLista() throws IOException{

        Stream<Double> puntuaciones = RepoVotaciones.getRepo().getVotaciones().stream()
                .map(votacion -> {
                    try {
                        return PuntajeService.calcularPuntaje(votacion);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .sorted(Comparator.reverseOrder())
                ;
        for (int i = 0; i<4; i++){
            System.out.println(puntuaciones.toArray()[i]);
        }


        ;

    }
}
