package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "vehicle")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "vehicle_type")
public abstract class Vehicle {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
        private UUID uuid;
        @Column(name = "type")
        private String type;
        @Column(name = "capacity")
        private int capacity;

        @Column(name = "maintenance_start_date")
        private LocalDate maintenanceStartDate;
        @Column(name = "maintenance_end_date")
        private LocalDate maintenanceEndDate;

        @Column(name = "service_start_date")
        private LocalDate serviceStartDate;
        @Column(name = "service_end_date")
        private LocalDate serviceEndDate;

    @ManyToMany(mappedBy = "vehicle")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "vehicle")
    private List<Route> routes;

    public Vehicle() {

    }

    public Vehicle(String type, int capacity, LocalDate maintenanceStartDate, LocalDate maintenanceEndDate, LocalDate serviceStartDate, LocalDate serviceEndDate) {
        this.type = type;
        this.capacity = capacity;
        this.maintenanceStartDate = maintenanceStartDate;
        this.maintenanceEndDate = maintenanceEndDate;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
    }

    public UUID getUUID() {
        return uuid;
    }

    public void setUUID(UUID uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getMaintenanceStartDate() {
        return maintenanceStartDate;
    }

    public void setMaintenanceStartDate(LocalDate maintenanceStartDate) {
        this.maintenanceStartDate = maintenanceStartDate;
    }

    public LocalDate getMaintenanceEndDate() {
        return maintenanceEndDate;
    }

    public void setMaintenanceEndDate(LocalDate maintenanceEndDate) {
        this.maintenanceEndDate = maintenanceEndDate;
    }

    public LocalDate getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(LocalDate serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public LocalDate getServiceEndDate() {
        return serviceEndDate;
    }

    public void setServiceEndDate(LocalDate serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}


