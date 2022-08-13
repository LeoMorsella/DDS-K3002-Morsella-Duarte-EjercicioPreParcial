package Modelo.Colegio;

import Modelo.Colegio.Votacion;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import java.util.ArrayList;


public class RepoVotaciones implements WithGlobalEntityManager {

    ArrayList<Votacion> votaciones = new ArrayList<>();
    static RepoVotaciones instance = null;

    public static RepoVotaciones getRepo(){
        if(instance == null) {instance = new RepoVotaciones();}
        return instance;
    }

    public ArrayList<Votacion> getVotaciones() {
        return votaciones;
    }
    public void setVotaciones(ArrayList<Votacion> votaciones) {
        this.votaciones = votaciones;
    }
}
