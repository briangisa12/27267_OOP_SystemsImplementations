package q6;

import java.time.LocalDateTime;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;
    
    public Payroll(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, LocalDateTime startDate, LocalDateTime endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   double grossSalary, double totalDeductions, double netSalary) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
              rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        // Gross salary = basic + allowances
        double calculatedGross = basicPay + transportAllowance + housingAllowance + (overtimeHours * overtimeRate) + bonus;
        if (Math.abs(grossSalary - calculatedGross) > 0.01) {
            throw new IllegalArgumentException("Gross salary must equal basic pay + allowances");
        }
        // Net salary = gross - deductions
        double calculatedNet = grossSalary - totalDeductions;
        if (Math.abs(netSalary - calculatedNet) > 0.01) {
            throw new IllegalArgumentException("Net salary must equal gross salary - total deductions");
        }
        this.grossSalary = grossSalary;
        this.totalDeductions = totalDeductions;
        this.netSalary = netSalary;
    }
    
    public double getGrossSalary() {
        return grossSalary;
    }
    
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    
    public double getTotalDeductions() {
        return totalDeductions;
    }
    
    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }
    
    public double getNetSalary() {
        return netSalary;
    }
    
    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Net Salary: " + netSalary);
    }
}

