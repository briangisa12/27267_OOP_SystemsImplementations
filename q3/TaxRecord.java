package q3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;
    
    public TaxRecord(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     LocalDateTime assessmentDate, double assessedTax,
                     LocalDateTime paymentDate, double paymentAmount,
                     String receiptNo, double totalTax) {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact, employeeName, salary, employeeTIN,
              declarationMonth, totalIncome, assessmentDate, assessedTax,
              paymentDate, paymentAmount);
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }
    
    public String getReceiptNo() {
        return receiptNo;
    }
    
    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }
    
    public double getTotalTax() {
        return totalTax;
    }
    
    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }
    
    public double computeTax() {
        double salary = getSalary();
        double rate = getRate();
        double credits = 0; // Can be extended to include tax credits
        
        double computedTax = (salary * rate) - credits;
        return computedTax;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Receipt No: " + receiptNo);
        System.out.println("Total Tax: " + totalTax);
    }
}

