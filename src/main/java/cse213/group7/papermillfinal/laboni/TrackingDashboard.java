package cse213.group7.papermillfinal.laboni;

import java.time.LocalDate;

public class TrackingDashboard {
    private String orderId;
    private String customer;
    private String type;
    private int qty;
    private String status;
    private LocalDate eta;

    public TrackingDashboard(String orderId, String customer, String type, int qty, String status, LocalDate eta) {
        this.orderId = orderId;
        this.customer = customer;
        this.type = type;
        this.qty = qty;
        this.status = status;
        this.eta = eta;
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

    public String getType() {
        return type;
    }

    public boolean isDelayed() {
        return eta.isBefore(LocalDate.now()) &&
                !status.equalsIgnoreCase("Delivered");
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

    public LocalDate getEta() {
        return eta;
    }

    public void setEta(LocalDate eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "TrackingDashboard{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", type='" + type + '\'' +
                ", qty=" + qty +
                ", status='" + status + '\'' +
                ", eta=" + eta +
                '}';
    }


}
