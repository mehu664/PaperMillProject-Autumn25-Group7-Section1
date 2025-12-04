package cse213.group7.papermillfinal.laboni;

public class Planning {
     String employeeID;
     String name;
     String department;
     String assignedShift;
     Integer otHours;

    public Planning(String employeeID, String name, String department, String assignedShift, Integer otHours) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.assignedShift = assignedShift;
        this.otHours = otHours;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAssignedShift() {
        return assignedShift;
    }

    public void setAssignedShift(String assignedShift) {
        this.assignedShift = assignedShift;
    }

    public Integer getOtHours() {
        return otHours;
    }

    public void setOtHours(Integer otHours) {
        this.otHours = otHours;
    }

    @Override
    public String toString() {
        return "Planning{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", assignedShift='" + assignedShift + '\'' +
                ", otHours=" + otHours +
                '}';
    }
}
