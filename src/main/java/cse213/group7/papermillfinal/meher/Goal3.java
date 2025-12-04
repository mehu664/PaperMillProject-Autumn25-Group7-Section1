package cse213.group7.papermillfinal.meher;

public class Goal3 {
    private String storageCapacityMartics, maxCapacity ,eventLog;

    public Goal3(String storageCapacityMartics, String maxCapacity, String eventLog) {
        this.storageCapacityMartics = storageCapacityMartics;
        this.maxCapacity = maxCapacity;
        this.eventLog = eventLog;
    }

    public String getStorageCapacityMartics() {
        return storageCapacityMartics;
    }

    public void setStorageCapacityMartics(String storageCapacityMartics) {
        this.storageCapacityMartics = storageCapacityMartics;
    }

    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getEventLog() {
        return eventLog;
    }

    public void setEventLog(String eventLog) {
        this.eventLog = eventLog;
    }

    @Override
    public String toString() {
        return "Goal3{" +
                "storageCapacityMartics='" + storageCapacityMartics + '\'' +
                ", maxCapacity='" + maxCapacity + '\'' +
                ", eventLog='" + eventLog + '\'' +
                '}';
    }
}
