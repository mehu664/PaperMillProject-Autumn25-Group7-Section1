package cse213.group7.papermillfinal.laboni;

public class EmployeeSchedule {
    String EmployeeId;
    String Name;
    String Department;
    String Shift;
    String Role;
    Integer House;
    String weekStart;


    public EmployeeSchedule(String employeeId, String name, String department, String shift, String role, Integer house, String weekStart) {
        this.EmployeeId = employeeId;
        this.Name = name;
        this.Department = department;
        this.Shift = shift;
        this.Role = role;
        House = house;
        this.weekStart = weekStart;
    }



    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.EmployeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String shift) {
        this.Shift = shift;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        this.Role = role;
    }

    public Integer getHouse() {
        return House;
    }

    public void setHouse(Integer house) {
        House = house;
    }

    public String getWeekStart() {
        return weekStart;
    }

    public void setWeekStart(String weekStart) {
        this.weekStart = weekStart;
    }

    @Override
    public String toString() {
        return "EmployeeSchedule{" +
                "employeeId='" + EmployeeId + '\'' +
                ", name='" + Name + '\'' +
                ", department='" + Department + '\'' +
                ", shift='" + Shift + '\'' +
                ", role='" + Role + '\'' +
                ", House=" + House +
                ", weekStart='" + weekStart + '\'' +
                '}';
    }
}
