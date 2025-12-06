package cse213.group7.papermillfinal.meher;

import java.time.LocalDate;

public class User4Goal3 {
    private String packageType;
    private int batchId,productId,defectCount,tootalProduced;
    private LocalDate date;

    public User4Goal3(String packageType, int batchId, int productId, int defectCount, int tootalProduced, LocalDate date) {
        this.packageType = packageType;
        this.batchId = batchId;
        this.productId = productId;
        this.defectCount = defectCount;
        this.tootalProduced = tootalProduced;
        this.date = date;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(int defectCount) {
        this.defectCount = defectCount;
    }

    public int getTootalProduced() {
        return tootalProduced;
    }

    public void setTootalProduced(int tootalProduced) {
        this.tootalProduced = tootalProduced;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User4Goal3{" +
                "packageType='" + packageType + '\'' +
                ", batchId=" + batchId +
                ", productId=" + productId +
                ", defectCount=" + defectCount +
                ", tootalProduced=" + tootalProduced +
                ", date=" + date +
                '}';
    }
}
