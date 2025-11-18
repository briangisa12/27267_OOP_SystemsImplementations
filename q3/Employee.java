package q3;

import java.time.LocalDateTime;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN;
    
    public Employee(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN) {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact);
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        if (employeeTIN == null || !employeeTIN.matches("\\d{9}")) {
            throw new IllegalArgumentException("Employee TIN must be exactly 9 digits");
        }
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        this.salary = salary;
    }
    
    public String getEmployeeTIN() {
        return employeeTIN;
    }
    
    public void setEmployeeTIN(String employeeTIN) {
        if (employeeTIN == null || !employeeTIN.matches("\\d{9}")) {
            throw new IllegalArgumentException("Employee TIN must be exactly 9 digits");
        }
        this.employeeTIN = employeeTIN;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Employee TIN: " + employeeTIN);
    }
}

