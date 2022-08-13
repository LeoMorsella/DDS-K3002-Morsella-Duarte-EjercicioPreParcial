package Servicios.Votacion;

import Modelo.Colegio.Colegio;
import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;
import Servicios.BDutils;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MostrarRecomendacion {

    public static List<Votacion> mostrarRecomendacion(){

        Session sess = BDutils.getCurrentSessionFromConfig(BDutils.getEntityManager()).openSession();
        List<Votacion> votaciones = sess.createQuery("SELECT v FROM Votacion v").list();
        List<Votante> votantes = sess.createQuery("SELECT x FROM Votante x").list();

        List<Votacion> votacionesDestacadas = votantes.stream()
                .filter(votante -> votante.getEsDestacado())
                .map(votante -> votante.getPeliculaVotada())
                .collect(Collectors.toList());

        Collections.shuffle(votacionesDestacadas);

        for (int i = 0; i < 10; i++){
            System.out.println(votacionesDestacadas.get(i));
        }

        return votaciones;
    }

}
