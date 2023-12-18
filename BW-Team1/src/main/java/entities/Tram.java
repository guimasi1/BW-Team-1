package entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "trams")
@DiscriminatorValue("Tram")
public class Tram extends Vehicle{
    @Column(name = "numero_vagoni")
    private int numeroVagoni;

    public Tram(){

    }

    public int getNumeroVagoni() {
        return numeroVagoni;
    }

    public void setNumeroVagoni(int numeroVagoni) {
        this.numeroVagoni = numeroVagoni;
    }
}
