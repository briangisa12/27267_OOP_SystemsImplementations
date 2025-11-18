package q6;

import java.time.LocalDateTime;

public class Employee extends Department {
    private String employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;
    
    public Employee(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName);
        if (employeeID == null || Integer.parseInt(employeeID) < 1000) {
            throw new IllegalArgumentException("Employee ID must be at least 1000");
        }
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0");
        }
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }
    
    public String getEmployeeID() {
        return employeeID;
    }
    
    public void setEmployeeID(String employeeID) {
        if (employeeID == null || Integer.parseInt(employeeID) < 1000) {
            throw new IllegalArgumentException("Employee ID must be at least 1000");
        }
        this.employeeID = employeeID;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0");
        }
        this.baseSalary = baseSalary;
    }
    
    public boolean isRssbRegistered() {
        return rssbRegistered;
    }
    
    public void setRssbRegistered(boolean rssbRegistered) {
        this.rssbRegistered = rssbRegistered;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("RSSB Registered: " + rssbRegistered);
    }
}

