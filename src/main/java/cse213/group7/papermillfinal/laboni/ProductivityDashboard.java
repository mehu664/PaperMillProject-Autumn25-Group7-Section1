package cse213.group7.papermillfinal.laboni;

public class ProductivityDashboard {
     String employee;
     int tasksCompleted;
     double avgTaskTime;
     double productivityScore;
     String status;


    public ProductivityDashboard(String employee, int tasksCompleted, double avgTaskTime, double productivityScore, String status) {
        this.employee = employee;
        this.tasksCompleted = tasksCompleted;
        this.avgTaskTime = avgTaskTime;
        this.productivityScore = productivityScore;
        this.status = status;
    }

    public ProductivityDashboard(String employee, int tasksCompleted, double avgTaskTime) {
        this.employee = employee;
        this.tasksCompleted = tasksCompleted;
        this.avgTaskTime = avgTaskTime;


        this.productivityScore = tasksCompleted / avgTaskTime;


        if (productivityScore >= 6)
            this.status = "High";
        else if (productivityScore >= 3)
            this.status = "Medium";
        else
            this.status = "Low";
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    public double getAvgTaskTime() {
        return avgTaskTime;
    }

    public void setAvgTaskTime(double avgTaskTime) {
        this.avgTaskTime = avgTaskTime;
    }

    public double getProductivityScore() {
        return productivityScore;
    }

    public void setProductivityScore(double productivityScore) {
        this.productivityScore = productivityScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductivityDashboard{" +
                "employee='" + employee + '\'' +
                ", tasksCompleted=" + tasksCompleted +
                ", avgTaskTime=" + avgTaskTime +
                ", productivityScore=" + productivityScore +
                ", status='" + status + '\'' +
                '}';
    }
}
