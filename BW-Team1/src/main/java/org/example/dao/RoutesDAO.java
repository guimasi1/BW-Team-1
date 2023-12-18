package org.example.dao;

import org.example.entities.Route;
import org.example.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.UUID;

public class RoutesDAO {
    private final EntityManager em;

    public RoutesDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Route route) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(route);

        transaction.commit();

        System.out.println("Route saved.");
    }

    public Route findById(UUID id) {
        TypedQuery<Route> query = em.createQuery("SELECT u FROM User u WHERE u.uuid = :id", Route.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void removeById(UUID id) {
        em.remove(this.findById(id));
    }
    
}