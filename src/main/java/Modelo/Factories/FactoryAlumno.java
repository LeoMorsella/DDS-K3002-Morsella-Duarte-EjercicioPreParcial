package Modelo.Factories;

import Modelo.Colegio.Alumno;
import Modelo.Colegio.Votante;

public class FactoryAlumno extends FactoryVotante {
    @Override
    public Votante crearVotante() {
        return new Alumno();
    }

}
