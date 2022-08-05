package Modelo.Colegio;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Alumno extends Votante {
    Double grado;

    public Double getGrado() {
        return grado;
    }

    public void setGrado(Double grado) {
        this.grado = grado;
    }

    public Alumno Alumno() {return new Alumno();}

    @Override
    public void cargarParametros(List<Object> parametros){
        this.nombre = (String) parametros.get(0);
        this.promedio = (Double) parametros.get(1);
        this.grado = (Double) parametros.get(2);
    }

}
