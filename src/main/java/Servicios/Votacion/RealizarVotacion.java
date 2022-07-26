package Servicios.Votacion;


import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;
import Modelo.Pelicula.PeliculaRequest;
import Servicios.BDutils;
import Modelo.Pelicula.PeliculaResponse;
import Servicios.Pelicula.ValidarPelicula;
import org.hibernate.Session;


import javax.persistence.EntityManager;

public class RealizarVotacion  {

    public static void nuevaVotacion(PeliculaRequest pelicula, Votante votante)throws Exception{
        if(votante.getVotacion() != null) {
            System.out.println("Este votante ya eligió su pelicula");
            throw new Exception();
        }
        generarVotacion(pelicula, votante);
    }

    static public void modificarVotacion(PeliculaRequest pelicula, Votante votante) throws Exception{
        if(votante.getVotacion() == null) {
            System.out.println("Este votante no eligió una pelicula aun");
            throw new Exception();
        }

        EntityManager em = BDutils.getEntityManager();
        Session sess = BDutils.getCurrentSessionFromConfig(em).openSession();
        BDutils.comenzarTransaccion(em);
        sess.delete(votante.getVotacion());
        sess.delete(votante.getVotacion().getPelicula());

        generarVotacion(pelicula, votante);
    }

    static public void generarVotacion(PeliculaRequest pelicula, Votante votante) throws Exception{
        PeliculaResponse peliculaVotada = ValidarPelicula.validarPelicula(pelicula);
        if(peliculaVotada!=null) {
            Votacion nuevaVotacion = new Votacion(peliculaVotada, votante);

            //persistencia;
            EntityManager em = BDutils.getEntityManager();
            Session sess = BDutils.getCurrentSessionFromConfig(em).openSession();
            BDutils.comenzarTransaccion(em);
            votante.setVotacion(nuevaVotacion);
            sess.update(votante);

            try {
                em.persist(nuevaVotacion.getPelicula());
                em.persist(nuevaVotacion);
            }
            catch (Exception e) {
                BDutils.rollback(em);
            }
            BDutils.commit(em);

        }
    }
}
