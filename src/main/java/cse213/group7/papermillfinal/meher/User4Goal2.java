package cse213.group7.papermillfinal.meher;

import java.time.LocalDate;

public class User4Goal2 {
    private  int batchId,defectCount,totalProduced;
    private LocalDate startDate,endDate;

    public User4Goal2(int batchId, int defectCount, int totalProduced, LocalDate startDate, LocalDate endDate) {
        this.batchId = batchId;
        this.defectCount = defectCount;
        this.totalProduced = totalProduced;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(int defectCount) {
        this.defectCount = defectCount;
    }

    public int getTotalProduced() {
        return totalProduced;
    }

    public void setTotalProduced(int totalProduced) {
        this.totalProduced = totalProduced;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "User4Goal2{" +
                "batchId=" + batchId +
                ", defectCount=" + defectCount +
                ", totalProduced=" + totalProduced +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
