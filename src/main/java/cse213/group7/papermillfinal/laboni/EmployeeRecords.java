package cse213.group7.papermillfinal.laboni;

public class EmployeeRecords {
     String employeeId;
     String department;
     String position;
     String contactNo;
     String address;

    public EmployeeRecords(String employeeId, String department, String position, String contactNo, String address) {
        this.employeeId = employeeId;
        this.department = department;
        this.position = position;
        this.contactNo = contactNo;
        this.address = address;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeRecords{" +
                "employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
