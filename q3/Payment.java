package q3;

import java.time.LocalDateTime;

public class Payment extends TaxAssessment {
    private LocalDateTime paymentDate;
    private double paymentAmount;
    
    public Payment(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String authorityName, String region, String email,
                   String categoryName, double rate, String code,
                   String tin, String taxpayerName, String address,
                   String employerName, String employerTIN, String contact,
                   String employeeName, double salary, String employeeTIN,
                   String declarationMonth, double totalIncome,
                   LocalDateTime assessmentDate, double assessedTax,
                   LocalDateTime paymentDate, double paymentAmount) {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact, employeeName, salary, employeeTIN,
              declarationMonth, totalIncome, assessmentDate, assessedTax);
        if (paymentAmount <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }
    
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }
    
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    public double getPaymentAmount() {
        return paymentAmount;
    }
    
    public void setPaymentAmount(double paymentAmount) {
        if (paymentAmount <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }
        this.paymentAmount = paymentAmount;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payment Date: " + paymentDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Payment Amount: " + paymentAmount);
    }
}

