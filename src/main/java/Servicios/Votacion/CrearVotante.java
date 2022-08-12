package Servicios.Votacion;

import Modelo.Colegio.*;
import Modelo.Factories.FactoryAlumno;
import Modelo.Factories.FactoryCurso;
import Modelo.Factories.FactoryGraduado;
import Modelo.Factories.FactoryVotante;

import java.util.List;
import java.util.Objects;

public class CrearVotante {

    public static FactoryVotante crearFactory(String tipo){
        FactoryVotante factory = null;
        if(Objects.equals(tipo, "alumno")) factory = new FactoryAlumno();
        else if(Objects.equals(tipo, "graduado")) factory = new FactoryGraduado();
        else if(Objects.equals(tipo, "curso")) factory = new FactoryCurso();
        return factory;
    }

    public static Votante crearVotante(String tipo, List<Object> parametros, Colegio colegio){
        FactoryVotante factory = crearFactory(tipo);
        Votante newVotante = factory.crearVotante();
        newVotante.cargarParametros(parametros);
        colegio.addVotante(newVotante);
        if(newVotante.esDestacado()) colegio.addDestacado(newVotante);
        return newVotante;
    }

}
