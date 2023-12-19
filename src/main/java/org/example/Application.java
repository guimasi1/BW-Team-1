package org.example;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BW-Team1");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EntityManager em = emf.createEntityManager();
    }
}