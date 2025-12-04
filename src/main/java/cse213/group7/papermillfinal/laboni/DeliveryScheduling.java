package cse213.group7.papermillfinal.laboni;

import java.time.LocalDate;

public class DeliveryScheduling {
    private String orderId;
    private String customer;
    private int qty;
    private String status;
    private int distance;
    private String vehicle;
    private LocalDate eta;
    private String priority;

    public DeliveryScheduling(String orderId, String customer, int qty, String status, int distance, String vehicle, LocalDate eta, String priority) {
        this.orderId = orderId;
        this.customer = customer;
        this.qty = qty;
        this.status = status;
        this.distance = distance;
        this.vehicle = vehicle;
        this.eta = eta;
        this.priority = priority;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getEta() {
        return eta;
    }

    public void setEta(LocalDate eta) {
        this.eta = eta;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "DeliveryScheduling{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", qty=" + qty +
                ", status='" + status + '\'' +
                ", distance=" + distance +
                ", vehicle='" + vehicle + '\'' +
                ", eta=" + eta +
                ", priority='" + priority + '\'' +
                '}';
    }
}
