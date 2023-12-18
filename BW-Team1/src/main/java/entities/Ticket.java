package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Ticket extends ControlManagement{

    LocalDate dataDiVidimazione;

    public Ticket(LocalDate dataEmissione, double prezzo, LocalDate dataDiVidimazione) {
        super(dataEmissione, prezzo);
        this.dataDiVidimazione = dataDiVidimazione;
    }

    public LocalDate getDataDiVidimazione() {
        return dataDiVidimazione;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "dataDiVidimazione=" + dataDiVidimazione +
                ", uuid=" + uuid +
                ", prezzo=" + prezzo +
                ", dataEmissione=" + dataEmissione +
                ", utente=" + utente +
                '}';
    }
}
