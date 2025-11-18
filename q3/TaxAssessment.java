package q3;

import java.time.LocalDateTime;

public class TaxAssessment extends TaxDeclaration {
    private LocalDateTime assessmentDate;
    private double assessedTax;
    
    public TaxAssessment(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                         String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeTIN,
                         String declarationMonth, double totalIncome,
                         LocalDateTime assessmentDate, double assessedTax) {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact, employeeName, salary, employeeTIN,
              declarationMonth, totalIncome);
        if (assessedTax < 0) {
            throw new IllegalArgumentException("Assessed tax must be greater than or equal to 0");
        }
        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }
    
    public LocalDateTime getAssessmentDate() {
        return assessmentDate;
    }
    
    public void setAssessmentDate(LocalDateTime assessmentDate) {
        this.assessmentDate = assessmentDate;
    }
    
    public double getAssessedTax() {
        return assessedTax;
    }
    
    public void setAssessedTax(double assessedTax) {
        if (assessedTax < 0) {
            throw new IllegalArgumentException("Assessed tax must be greater than or equal to 0");
        }
        this.assessedTax = assessedTax;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Assessment Date: " + assessmentDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Assessed Tax: " + assessedTax);
    }
}

