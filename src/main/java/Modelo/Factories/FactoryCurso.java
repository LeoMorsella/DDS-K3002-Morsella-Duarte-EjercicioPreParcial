package Modelo.Factories;

import Modelo.Colegio.Curso;
import Modelo.Colegio.Votante;

public class FactoryCurso extends FactoryVotante {
    @Override
    public Votante crearVotante() {
        return new Curso();
    }
}
