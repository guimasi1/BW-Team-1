package org.example;

import org.example.dao.RoutesDAO;
import org.example.entities.Route;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BW-Team1");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EntityManager em = emf.createEntityManager();
        RoutesDAO routesDAO= new RoutesDAO(em);
        Route route = new Route("nice", "prova", 21.0,19.0);
        // routesDAO.save(route);
        routesDAO.findRoutesByArrivalLocation("ov").forEach(System.out::println);

    }
}