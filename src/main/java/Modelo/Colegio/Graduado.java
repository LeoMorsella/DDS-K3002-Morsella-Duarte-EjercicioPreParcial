package Modelo.Colegio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Graduado extends Votante{



    boolean pagaAportes;
    public Graduado Graduado() { return new Graduado();}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public boolean getPagaAportes() {
        return pagaAportes;
    }

    public void setPagaAportes(boolean pagaAportes) {
        this.pagaAportes = pagaAportes;
    }

    public Votacion getPeliculaVotada() {
        return peliculaVotada;
    }

    public void setPeliculaVotada(Votacion peliculaVotada) {
        this.peliculaVotada = peliculaVotada;
    }

    @Override
    public void cargarParametros(List<Object> parametros){
        this.nombre = (String) parametros.get(0);
        this.promedio = (Double) parametros.get(1);
        this.pagaAportes = (boolean) parametros.get(2);
    }

    public boolean esDestacado(){
        return promedio > (Double) 8.0;
    }

}
