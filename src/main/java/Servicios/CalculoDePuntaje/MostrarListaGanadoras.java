package Servicios.CalculoDePuntaje;

import Modelo.Colegio.Votacion;
import Servicios.BDutils;
import org.hibernate.Session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MostrarListaGanadoras {


    static public List<Votacion> mostrarLista() throws IOException{

        Session sess = BDutils.getCurrentSessionFromConfig(BDutils.getEntityManager()).openSession();
        List<Votacion> votaciones = sess.createQuery("SELECT v FROM Votacion v").list();


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
