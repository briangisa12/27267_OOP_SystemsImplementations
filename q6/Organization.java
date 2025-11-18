package q6;

import java.time.LocalDateTime;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;
    
    public Organization(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) {
            throw new IllegalArgumentException("RSSB number must be exactly 8 digits");
        }
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (orgCode == null || orgCode.length() < 3) {
            throw new IllegalArgumentException("Organization code must be at least 3 characters");
        }
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }
    
    public String getOrgName() {
        return orgName;
    }
    
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    public String getOrgCode() {
        return orgCode;
    }
    
    public void setOrgCode(String orgCode) {
        if (orgCode == null || orgCode.length() < 3) {
            throw new IllegalArgumentException("Organization code must be at least 3 characters");
        }
        this.orgCode = orgCode;
    }
    
    public String getRssbNumber() {
        return rssbNumber;
    }
    
    public void setRssbNumber(String rssbNumber) {
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) {
            throw new IllegalArgumentException("RSSB number must be exactly 8 digits");
        }
        this.rssbNumber = rssbNumber;
    }
    
    public String getContactEmail() {
        return contactEmail;
    }
    
    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.contactEmail = contactEmail;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Organization Name: " + orgName);
        System.out.println("Organization Code: " + orgCode);
        System.out.println("RSSB Number: " + rssbNumber);
        System.out.println("Contact Email: " + contactEmail);
    }
}

