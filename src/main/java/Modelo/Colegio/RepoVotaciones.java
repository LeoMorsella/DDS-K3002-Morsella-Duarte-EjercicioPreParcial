package Modelo.Colegio;

import Modelo.Colegio.Votacion;

import java.util.ArrayList;

//Esta clase es provisoria hasta implementar hibernate
public class RepoVotaciones {

    ArrayList<Votacion> votaciones;
    static RepoVotaciones instance = null;

    public static RepoVotaciones getRepo(){
        if(instance == null) return new RepoVotaciones();
        else return instance;
    }


    public ArrayList<Votacion> getVotaciones() {
        return votaciones;
    }
    public void setVotaciones(ArrayList<Votacion> votaciones) {
        this.votaciones = votaciones;
    }
}
