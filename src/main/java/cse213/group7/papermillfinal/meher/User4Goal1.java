package cse213.group7.papermillfinal.meher;

import java.time.LocalDate;

public class User4Goal1 {
    private String paperType,status,property;
    private int batchId,value;
    private LocalDate productionDate;

    public User4Goal1(String paperType, String status, String property, int batchId, int value, LocalDate productionDate) {
        this.paperType = paperType;
        this.status = status;
        this.property = property;
        this.batchId = batchId;
        this.value = value;
        this.productionDate = productionDate;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "User4Goal1{" +
                "paperType='" + paperType + '\'' +
                ", status='" + status + '\'' +
                ", property='" + property + '\'' +
                ", batchId=" + batchId +
                ", value=" + value +
                ", productionDate=" + productionDate +
                '}';
    }
}
