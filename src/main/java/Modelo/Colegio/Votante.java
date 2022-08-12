package Modelo.Colegio;

import javax.persistence.*;
import java.util.List;

// Actualizar para prototype
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_votante", discriminatorType = DiscriminatorType.STRING)
public abstract class Votante {
    String nombre;

    @Id
    @GeneratedValue
    int id_votante;

    //cambiar
    @OneToOne
    Votacion peliculaVotada;

    Double promedio;

    boolean esDestacado;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Votacion getPeliculaVotada() {
        return peliculaVotada;
    }

    public void setPeliculaVotada(Votacion peliculaVotada) {
        this.peliculaVotada = peliculaVotada;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    //Los parametros se toman desde un formulario de la web
    abstract public void cargarParametros(List<Object> parametros);

    abstract public boolean esDestacado();
}
