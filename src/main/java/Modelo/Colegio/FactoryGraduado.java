package Modelo.Colegio;

public class FactoryGraduado extends FactoryVotante {

    @Override
    public Votante crearVotante() {
        return new Graduado();
    }

}
