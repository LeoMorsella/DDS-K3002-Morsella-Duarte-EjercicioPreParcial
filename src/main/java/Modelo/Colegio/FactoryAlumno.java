package Modelo.Colegio;

public class FactoryAlumno extends FactoryVotante {
    @Override
    public Votante crearVotante() {
        return new Alumno();
    }

}
