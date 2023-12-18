package entities;

import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
public class Pass extends  ControlManagement {
    Periodicity periodicity;
    LocalDate dataDiScadenza;

    public Pass(LocalDate dataEmissione, double prezzo, Periodicity periodicity, LocalDate dataDiScadenza) {
        super(dataEmissione, prezzo);
        this.periodicity = periodicity;
        this.dataDiScadenza = dataDiScadenza;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }

    public LocalDate getDataDiScadenza() {
        return dataDiScadenza;
    }

    public void setDataDiScadenza(LocalDate dataDiScadenza) {
        this.dataDiScadenza = dataDiScadenza;
    }
}
