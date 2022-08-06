package Servicios.Votacion;

import Modelo.Colegio.Colegio;
import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;

import java.util.List;

public class MostrarRecomendacion {

    public List<Votacion> mostrarRecomendacion(Colegio colegio){

        List<Votante> destacados = colegio.getDestacados();
        List<Votacion> votaciones = null;
        Votacion votacionTemp = null;
        while (votaciones.size() < destacados.size()){
            votacionTemp =  destacados.get((int)(Math.random() * destacados.size())).getPeliculaVotada();
            if (!(votaciones.contains(votacionTemp))) votaciones.add(votacionTemp);
        }
        return votaciones;
    }

}
