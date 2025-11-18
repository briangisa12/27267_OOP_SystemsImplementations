package q4;

import java.time.LocalDateTime;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;
    
    public Organization(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                        String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
    
    public String getOrgName() {
        return orgName;
    }
    
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
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
        System.out.println("Address: " + address);
        System.out.println("Contact Email: " + contactEmail);
    }
}

