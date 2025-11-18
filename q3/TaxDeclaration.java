package q3;

import java.time.LocalDateTime;

public class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome;
    
    public TaxDeclaration(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                          String authorityName, String region, String email,
                          String categoryName, double rate, String code,
                          String tin, String taxpayerName, String address,
                          String employerName, String employerTIN, String contact,
                          String employeeName, double salary, String employeeTIN,
                          String declarationMonth, double totalIncome) {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        if (totalIncome < 0) {
            throw new IllegalArgumentException("Total income must be greater than or equal to 0");
        }
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }
    
    public String getDeclarationMonth() {
        return declarationMonth;
    }
    
    public void setDeclarationMonth(String declarationMonth) {
        this.declarationMonth = declarationMonth;
    }
    
    public double getTotalIncome() {
        return totalIncome;
    }
    
    public void setTotalIncome(double totalIncome) {
        if (totalIncome < 0) {
            throw new IllegalArgumentException("Total income must be greater than or equal to 0");
        }
        this.totalIncome = totalIncome;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Declaration Month: " + declarationMonth);
        System.out.println("Total Income: " + totalIncome);
    }
}

