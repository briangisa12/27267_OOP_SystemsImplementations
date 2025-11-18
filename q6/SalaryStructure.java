package q6;

import java.time.LocalDateTime;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;
    
    public SalaryStructure(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                           String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                           int month, int year, LocalDateTime startDate, LocalDateTime endDate,
                           double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate);
        if (basicPay < 0 || transportAllowance < 0 || housingAllowance < 0) {
            throw new IllegalArgumentException("All salary components must be greater than or equal to 0");
        }
        this.basicPay = basicPay;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }
    
    public double getBasicPay() {
        return basicPay;
    }
    
    public void setBasicPay(double basicPay) {
        if (basicPay < 0) {
            throw new IllegalArgumentException("Basic pay must be greater than or equal to 0");
        }
        this.basicPay = basicPay;
    }
    
    public double getTransportAllowance() {
        return transportAllowance;
    }
    
    public void setTransportAllowance(double transportAllowance) {
        if (transportAllowance < 0) {
            throw new IllegalArgumentException("Transport allowance must be greater than or equal to 0");
        }
        this.transportAllowance = transportAllowance;
    }
    
    public double getHousingAllowance() {
        return housingAllowance;
    }
    
    public void setHousingAllowance(double housingAllowance) {
        if (housingAllowance < 0) {
            throw new IllegalArgumentException("Housing allowance must be greater than or equal to 0");
        }
        this.housingAllowance = housingAllowance;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Transport Allowance: " + transportAllowance);
        System.out.println("Housing Allowance: " + housingAllowance);
    }
}

