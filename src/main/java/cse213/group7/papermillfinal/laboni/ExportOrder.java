package cse213.group7.papermillfinal.laboni;

public class ExportOrder {
    private String orderId;
    private String customer;
    private String type;
    private int qty;

    public ExportOrder(String orderId, String customer, String type, int qty) {
        this.orderId = orderId;
        this.customer = customer;
        this.type = type;
        this.qty = qty;
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

    public void setType(String type) {
        this.type = type;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ExportOrder{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", type='" + type + '\'' +
                ", qty=" + qty +
                '}';
    }
}
