package q6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private LocalDateTime issueDate;
    
    public Payslip(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, LocalDateTime startDate, LocalDateTime endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   double grossSalary, double totalDeductions, double netSalary,
                   String payslipNumber, LocalDateTime issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
              rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus,
              grossSalary, totalDeductions, netSalary);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }
    
    public String getPayslipNumber() {
        return payslipNumber;
    }
    
    public void setPayslipNumber(String payslipNumber) {
        this.payslipNumber = payslipNumber;
    }
    
    public LocalDateTime getIssueDate() {
        return issueDate;
    }
    
    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }
    
    public void generatePayslip() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        System.out.println("\n========== PAYSLIP [27267] ==========");
        System.out.println("Payslip Number: " + payslipNumber);
        System.out.println("Issue Date: " + issueDate.format(formatter));
        System.out.println("\n--- Employee Information ---");
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Position: " + getPosition());
        System.out.println("Department: " + getDeptName());
        System.out.println("\n--- Payroll Period ---");
        System.out.println("Month: " + getMonth() + "/" + getYear());
        System.out.println("Period: " + getStartDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + 
                         " to " + getEndDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("\n--- Earnings ---");
        System.out.println("Basic Pay: " + getBasicPay());
        System.out.println("Transport Allowance: " + getTransportAllowance());
        System.out.println("Housing Allowance: " + getHousingAllowance());
        System.out.println("Overtime (" + getOvertimeHours() + " hrs @ " + getOvertimeRate() + "): " + 
                         (getOvertimeHours() * getOvertimeRate()));
        System.out.println("Bonus: " + getBonus());
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("\n--- Deductions ---");
        System.out.println("RSSB Contribution (5%): " + getRssbContribution());
        System.out.println("PAYE Tax: " + getPayeTax());
        System.out.println("Loan Deduction: " + getLoanDeduction());
        System.out.println("Total Deductions: " + getTotalDeductions());
        System.out.println("\n--- Net Salary ---");
        System.out.println("Net Salary: " + getNetSalary());
        System.out.println("\n--- RSSB Information ---");
        System.out.println("RSSB Registered: " + (isRssbRegistered() ? "Yes" : "No"));
        System.out.println("RSSB Number: " + getRssbNumber());
        System.out.println("=====================================\n");
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payslip Number: " + payslipNumber);
        System.out.println("Issue Date: " + issueDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

