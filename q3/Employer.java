package q3;

import java.time.LocalDateTime;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN;
    private String contact;
    
    public Employer(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address);
        if (employerTIN == null || !employerTIN.matches("\\d{9}")) {
            throw new IllegalArgumentException("Employer TIN must be exactly 9 digits");
        }
        if (contact == null || !contact.matches("\\d{10}")) {
            throw new IllegalArgumentException("Contact must be exactly 10 digits");
        }
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }
    
    public String getEmployerName() {
        return employerName;
    }
    
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
    
    public String getEmployerTIN() {
        return employerTIN;
    }
    
    public void setEmployerTIN(String employerTIN) {
        if (employerTIN == null || !employerTIN.matches("\\d{9}")) {
            throw new IllegalArgumentException("Employer TIN must be exactly 9 digits");
        }
        this.employerTIN = employerTIN;
    }
    
    public String getContact() {
        return contact;
    }
    
    public void setContact(String contact) {
        if (contact == null || !contact.matches("\\d{10}")) {
            throw new IllegalArgumentException("Contact must be exactly 10 digits");
        }
        this.contact = contact;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employer Name: " + employerName);
        System.out.println("Employer TIN: " + employerTIN);
        System.out.println("Contact: " + contact);
    }
}

