package q5;

import java.time.LocalDateTime;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;
    
    public Institution(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                       String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (code == null || code.length() < 3) {
            throw new IllegalArgumentException("Code must be at least 3 characters");
        }
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }
    
    public String getInstitutionName() {
        return institutionName;
    }
    
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
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
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Code: " + code);
        System.out.println("Address: " + address);
    }
}

