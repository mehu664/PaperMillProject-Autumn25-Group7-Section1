package cse213.group7.papermillfinal.meher;

public class Goal1 {
    private String materialName,supplierName, transport ;
    private int quantity,distance,orderDate;

    public Goal1(String materialName, String supplierName, String transport, int quantity, int orderDate, int distance) {
        this.materialName = materialName;
        this.supplierName = supplierName;
        this.transport = transport;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.distance = distance;
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

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
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
