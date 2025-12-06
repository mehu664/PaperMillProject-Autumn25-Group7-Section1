package cse213.group7.papermillfinal.meher;

public class Goal5 {
    private String selectSupplier, selectMaterial,routeOptions;
    private int distance, estimatedTime,cost;

    public Goal5(String selectSupplier, String selectMaterial, String routeOptions, int distance, int estimatedTime, int cost) {
        this.selectSupplier = selectSupplier;
        this.selectMaterial = selectMaterial;
        this.routeOptions = routeOptions;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
        this.cost = cost;
    }

    public String getSelectSupplier() {
        return selectSupplier;
    }

    public void setSelectSupplier(String selectSupplier) {
        this.selectSupplier = selectSupplier;
    }

    public String getSelectMaterial() {
        return selectMaterial;
    }

    public void setSelectMaterial(String selectMaterial) {
        this.selectMaterial = selectMaterial;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getRouteOptions() {
        return routeOptions;
    }

    public void setRouteOptions(String routeOptions) {
        this.routeOptions = routeOptions;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Goal5{" +
                "selectSupplier='" + selectSupplier + '\'' +
                ", selectMaterial='" + selectMaterial + '\'' +
                ", routeOptions='" + routeOptions + '\'' +
                ", distance=" + distance +
                ", estimatedTime=" + estimatedTime +
                ", cost=" + cost +
                '}';
    }
}
