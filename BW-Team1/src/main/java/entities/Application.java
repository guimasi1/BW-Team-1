package entities;

import DAO.VehicleDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BW-Team1");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        VehicleDAO vd = new VehicleDAO(em);

		//vd.save();


      /* DELETE
        vd.findVehicleByUUID();
          System.out.println("Vehicle deleted");
       */

}
}
