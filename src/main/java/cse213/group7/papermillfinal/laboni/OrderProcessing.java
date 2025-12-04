package cse213.group7.papermillfinal.laboni;

public class OrderProcessing {
    private String productType;
    private String priority;
    private String customerName;
    private int quantity;

    public OrderProcessing(String productType, String priority, String customerName, int quantity) {
        this.productType = productType;
        this.priority = priority;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderProcessing{" +
                "productType='" + productType + '\'' +
                ", priority='" + priority + '\'' +
                ", customerName='" + customerName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
