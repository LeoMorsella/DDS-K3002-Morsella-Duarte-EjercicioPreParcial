package Servicios;


import Modelo.Colegio.Votacion;
import Modelo.Colegio.Votante;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class BDutils {
    private static final EntityManagerFactory factory;

    static {
            factory = Persistence.createEntityManagerFactory("db");
    }

    static public EntityManager getEntityManager() {
        EntityManager em = factory.createEntityManager();
        return em;
    }

    public static void comenzarTransaccion(EntityManager em) {
        EntityTransaction tx = em.getTransaction();
        if (!tx.isActive()) {
            tx.begin();
        }
    }

    public static void commit(EntityManager em) {
        EntityTransaction tx = em.getTransaction();
        if (tx.isActive()) {
            tx.commit();
        }
    }

    public static void rollback(EntityManager em) {
        EntityTransaction tx = em.getTransaction();
        if (tx.isActive()) {
            tx.rollback();
        }
    }

    public static SessionFactory getCurrentSessionFromConfig(EntityManager entityManager) {
        Session session = entityManager.unwrap(org.hibernate.Session.class);
        SessionFactory factory = session.getSessionFactory();
        return factory;
    }

}
