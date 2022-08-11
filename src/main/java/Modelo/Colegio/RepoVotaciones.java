package Modelo.Colegio;

import Modelo.Colegio.Votacion;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import java.util.ArrayList;

//Esta clase es provisoria hasta implementar hibernate
public class RepoVotaciones implements WithGlobalEntityManager {

    ArrayList<Votacion> votaciones = new ArrayList<>();
    static RepoVotaciones instance = null;

    public static RepoVotaciones getRepo(){
        if(instance == null) {instance = new RepoVotaciones();}
        return instance;
    }

    public void persistirVotaciones() {
        for(Votacion votacion : votaciones) {
                 entityManager().persist(votacion);
        }
    }
    public ArrayList<Votacion> getVotaciones() {
        return votaciones;
    }
    public void setVotaciones(ArrayList<Votacion> votaciones) {
        this.votaciones = votaciones;
    }
}
