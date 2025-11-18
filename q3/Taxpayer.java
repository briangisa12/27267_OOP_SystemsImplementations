package q3;

import java.time.LocalDateTime;

public class Taxpayer extends TaxCategory {
    private String tin;
    private String taxpayerName;
    private String address;
    
    public Taxpayer(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address) {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code);
        if (tin == null || !tin.matches("\\d{9}")) {
            throw new IllegalArgumentException("TIN must be exactly 9 digits");
        }
        if (taxpayerName == null || taxpayerName.isEmpty()) {
            throw new IllegalArgumentException("Taxpayer name must not be empty");
        }
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }
    
    public String getTin() {
        return tin;
    }
    
    public void setTin(String tin) {
        if (tin == null || !tin.matches("\\d{9}")) {
            throw new IllegalArgumentException("TIN must be exactly 9 digits");
        }
        this.tin = tin;
    }
    
    public String getTaxpayerName() {
        return taxpayerName;
    }
    
    public void setTaxpayerName(String taxpayerName) {
        if (taxpayerName == null || taxpayerName.isEmpty()) {
            throw new IllegalArgumentException("Taxpayer name must not be empty");
        }
        this.taxpayerName = taxpayerName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("TIN: " + tin);
        System.out.println("Taxpayer Name: " + taxpayerName);
        System.out.println("Address: " + address);
    }
}

