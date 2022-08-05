package Modelo.Colegio;

public class FactoryCurso extends FactoryVotante {
    @Override
    public Votante crearVotante() {
        return new Curso();
    }
}
