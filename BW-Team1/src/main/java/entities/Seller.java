package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class Seller {
    @Id
    @GeneratedValue
    private UUID id;
    private String puntoDiEmissione;
    private SellerType sellerType;
    private Service serviceType;
    @OneToMany(mappedBy = "Seller")
    private List<ControlManagement> controlManagementList;

    public Seller() {}

    public Seller(String puntoDiEmissione, SellerType sellerType, Service serviceType, List<ControlManagement> controlManagementList) {
        this.puntoDiEmissione = puntoDiEmissione;
        this.sellerType = sellerType;
        this.serviceType = serviceType;
        this.controlManagementList = controlManagementList;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPuntoDiEmissione() {
        return puntoDiEmissione;
    }

    public void setPuntoDiEmissione(String puntoDiEmissione) {
        this.puntoDiEmissione = puntoDiEmissione;
    }

    public SellerType getSellerType() {
        return sellerType;
    }

    public void setSellerType(SellerType sellerType) {
        this.sellerType = sellerType;
    }

    public Service getServiceType() {
        return serviceType;
    }

    public void setServiceType(Service serviceType) {
        this.serviceType = serviceType;
    }

    public List<ControlManagement> getControlManagementList() {
        return controlManagementList;
    }

    public void setControlManagementList(List<ControlManagement> controlManagementList) {
        this.controlManagementList = controlManagementList;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", puntoDiEmissione='" + puntoDiEmissione + '\'' +
                ", sellerType=" + sellerType +
                ", serviceType=" + serviceType +
                ", controlManagementList=" + controlManagementList +
                '}';
    }
}
