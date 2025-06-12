package model.entities;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime startDate;
    private LocalDateTime finishDate;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {
    }

    public CarRental(LocalDateTime startDate, LocalDateTime finishDate, String carModel) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.vehicle = new Vehicle(carModel);
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getFinishDate() {
        return finishDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setFinishDate(LocalDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public void setStratDate(LocalDateTime stratDate) {
        this.startDate = stratDate;
    }
}
