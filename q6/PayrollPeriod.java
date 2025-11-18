package q6;

import java.time.LocalDateTime;

public class PayrollPeriod extends Employee {
    private int month;
    private int year;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    
    public PayrollPeriod(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                         String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, LocalDateTime startDate, LocalDateTime endDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered);
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        if (year < 2000) {
            throw new IllegalArgumentException("Year must be at least 2000");
        }
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates must not be null");
        }
        this.month = month;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        this.month = month;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        if (year < 2000) {
            throw new IllegalArgumentException("Year must be at least 2000");
        }
        this.year = year;
    }
    
    public LocalDateTime getStartDate() {
        return startDate;
    }
    
    public void setStartDate(LocalDateTime startDate) {
        if (startDate == null) {
            throw new IllegalArgumentException("Start date must not be null");
        }
        this.startDate = startDate;
    }
    
    public LocalDateTime getEndDate() {
        return endDate;
    }
    
    public void setEndDate(LocalDateTime endDate) {
        if (endDate == null) {
            throw new IllegalArgumentException("End date must not be null");
        }
        this.endDate = endDate;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Start Date: " + startDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("End Date: " + endDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

