package cse213.group7.papermillfinal.meher;

public class User4Goal5 {
    private String customerName;
    private int productCode;

    public User4Goal5(String customerName, int productCode) {
        this.customerName = customerName;
        this.productCode = productCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "User4Goal5{" +
                "customerName='" + customerName + '\'' +
                ", productCode=" + productCode +
                '}';
    }
}
