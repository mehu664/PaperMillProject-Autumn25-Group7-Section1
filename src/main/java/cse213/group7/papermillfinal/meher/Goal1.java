package cse213.group7.papermillfinal.meher;

import java.io.Serializable;
import java.time.LocalDate;

public class Goal1 implements Serializable {
    private String materialName,supplierName, transport ;
    private int quantity,distance;
    private LocalDate orderDate;

    public Goal1(String materialName, String supplierName, int quantity, String transport, int distance, LocalDate orderDate) {
        this.materialName = materialName;
        this.supplierName = supplierName;
        this.quantity = quantity;
        this.transport = transport;
        this.distance = distance;
        this.orderDate = orderDate;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Goal1{" +
                "materialName='" + materialName + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", transport='" + transport + '\'' +
                ", quantity=" + quantity +
                ", distance=" + distance +
                ", orderDate=" + orderDate +
                '}';
    }
}
