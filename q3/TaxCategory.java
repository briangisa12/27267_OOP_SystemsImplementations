package q3;

import java.time.LocalDateTime;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;
    
    public TaxCategory(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if (rate <= 0) {
            throw new IllegalArgumentException("Rate must be greater than 0");
        }
        if (code == null || code.length() < 3) {
            throw new IllegalArgumentException("Code must be at least 3 characters");
        }
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public double getRate() {
        return rate;
    }
    
    public void setRate(double rate) {
        if (rate <= 0) {
            throw new IllegalArgumentException("Rate must be greater than 0");
        }
        this.rate = rate;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        if (code == null || code.length() < 3) {
            throw new IllegalArgumentException("Code must be at least 3 characters");
        }
        this.code = code;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category Name: " + categoryName);
        System.out.println("Rate: " + rate);
        System.out.println("Code: " + code);
    }
}

