package Modelo.Factories;

import Modelo.Colegio.Graduado;
import Modelo.Colegio.Votante;

public class FactoryGraduado extends FactoryVotante {

    @Override
    public Votante crearVotante() {
        return new Graduado();
    }

}
