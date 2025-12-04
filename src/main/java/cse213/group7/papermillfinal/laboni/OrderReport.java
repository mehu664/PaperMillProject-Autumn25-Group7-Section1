package cse213.group7.papermillfinal.laboni;

import java.time.LocalDate;

public class OrderReport {

    private String orderId;
    private String customer;
    private LocalDate date;
    private int quantity;
    private String status;

    public OrderReport(String orderId, String customer, LocalDate date, int quantity, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.date = date;
        this.quantity = quantity;
        this.status = status;
    }

    public OrderReport() {

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderReport{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", date=" + date +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}
