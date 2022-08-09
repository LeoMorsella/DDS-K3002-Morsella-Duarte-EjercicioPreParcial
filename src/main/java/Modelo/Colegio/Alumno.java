package Modelo.Colegio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Alumno extends Votante {

    Double grado;

    boolean esAbanderado;

    public Double getGrado() {
        return grado;
    }

    public void setGrado(Double grado) {
        this.grado = grado;
    }

    public Alumno Alumno() {return new Alumno();}

    public boolean esAbanderado() {
        return esAbanderado;
    }

    public void setEsAbanderado(boolean esAbanderado) {
        this.esAbanderado = esAbanderado;
    }

    @Override
    public void cargarParametros(List<Object> parametros){
        this.nombre = (String) parametros.get(0);
        this.promedio = (Double) parametros.get(1);
        this.grado = (Double) parametros.get(2);
        this.esAbanderado = (boolean) parametros.get(3);
    }

    public boolean esDestacado(){
        return esAbanderado;
    }
}
