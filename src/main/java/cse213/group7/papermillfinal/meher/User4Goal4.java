package cse213.group7.papermillfinal.meher;

import java.time.LocalDate;

public class User4Goal4 {
    private String testProperty,status;
    private int batchId,value;
    private LocalDate startDate, endDate;

    public User4Goal4(String strength, String pass, int i, int i1, LocalDate start, LocalDate end) {
    }

    public String getTestProperty() {
        return testProperty;
    }

    public void setTestProperty(String testProperty) {
        this.testProperty = testProperty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "User4Goal4{" +
                "testProperty='" + testProperty + '\'' +
                ", status='" + status + '\'' +
                ", batchId=" + batchId +
                ", value=" + value +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
