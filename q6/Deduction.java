package q6;

import java.time.LocalDateTime;

public class Deduction extends SalaryStructure {
    private double rssbContribution;
    private double payeTax;
    private double loanDeduction;
    
    public Deduction(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, LocalDateTime startDate, LocalDateTime endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double payeTax, double loanDeduction) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        if (rssbContribution < 0 || payeTax < 0 || loanDeduction < 0) {
            throw new IllegalArgumentException("All deductions must be greater than or equal to 0");
        }
        // RSSB contribution should be 5% of basic pay
        double expectedRssb = basicPay * 0.05;
        if (Math.abs(rssbContribution - expectedRssb) > 0.01) {
            throw new IllegalArgumentException("RSSB contribution must be 5% of basic pay");
        }
        this.rssbContribution = rssbContribution;
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
    }
    
    public double getRssbContribution() {
        return rssbContribution;
    }
    
    public void setRssbContribution(double rssbContribution) {
        if (rssbContribution < 0) {
            throw new IllegalArgumentException("RSSB contribution must be greater than or equal to 0");
        }
        this.rssbContribution = rssbContribution;
    }
    
    public double getPayeTax() {
        return payeTax;
    }
    
    public void setPayeTax(double payeTax) {
        if (payeTax < 0) {
            throw new IllegalArgumentException("PAYE tax must be greater than or equal to 0");
        }
        this.payeTax = payeTax;
    }
    
    public double getLoanDeduction() {
        return loanDeduction;
    }
    
    public void setLoanDeduction(double loanDeduction) {
        if (loanDeduction < 0) {
            throw new IllegalArgumentException("Loan deduction must be greater than or equal to 0");
        }
        this.loanDeduction = loanDeduction;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("RSSB Contribution: " + rssbContribution);
        System.out.println("PAYE Tax: " + payeTax);
        System.out.println("Loan Deduction: " + loanDeduction);
    }
}

