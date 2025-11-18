package q3;

import java.time.LocalDateTime;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;
    
    public TaxAuthority(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                        String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }
    
    public String getAuthorityName() {
        return authorityName;
    }
    
    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Authority Name: " + authorityName);
        System.out.println("Region: " + region);
        System.out.println("Email: " + email);
    }
}

