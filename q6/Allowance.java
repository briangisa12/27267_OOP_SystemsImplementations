package q6;

import java.time.LocalDateTime;

public class Allowance extends Deduction {
    private double overtimeHours;
    private double overtimeRate;
    private double bonus;
    
    public Allowance(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, LocalDateTime startDate, LocalDateTime endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double payeTax, double loanDeduction,
                     double overtimeHours, double overtimeRate, double bonus) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
              rssbContribution, payeTax, loanDeduction);
        if (overtimeHours < 0 || overtimeRate < 0 || bonus < 0) {
            throw new IllegalArgumentException("All allowance components must be greater than or equal to 0");
        }
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonus = bonus;
    }
    
    public double getOvertimeHours() {
        return overtimeHours;
    }
    
    public void setOvertimeHours(double overtimeHours) {
        if (overtimeHours < 0) {
            throw new IllegalArgumentException("Overtime hours must be greater than or equal to 0");
        }
        this.overtimeHours = overtimeHours;
    }
    
    public double getOvertimeRate() {
        return overtimeRate;
    }
    
    public void setOvertimeRate(double overtimeRate) {
        if (overtimeRate < 0) {
            throw new IllegalArgumentException("Overtime rate must be greater than or equal to 0");
        }
        this.overtimeRate = overtimeRate;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus must be greater than or equal to 0");
        }
        this.bonus = bonus;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Overtime Rate: " + overtimeRate);
        System.out.println("Bonus: " + bonus);
    }
}

