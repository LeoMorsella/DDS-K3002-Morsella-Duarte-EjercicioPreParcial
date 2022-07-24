package Modelo.Colegio;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Votante {
  //  @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_votante;
    String nombre;
    String id;
    String dni;
    Votacion peliculaVotada;

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public Votacion getPeliculaVotada() {
        return peliculaVotada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPeliculaVotada(Votacion peliculaVotada) {
        this.peliculaVotada = peliculaVotada;
    }
}
