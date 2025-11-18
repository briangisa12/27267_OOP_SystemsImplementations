package q4;

import java.time.LocalDateTime;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    
    public Department(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String orgName, String address, String contactEmail,
                     String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Department code must be alphanumeric and at least 3 characters");
        }
        this.deptName = deptName;
        this.deptCode = deptCode;
    }
    
    public String getDeptName() {
        return deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    public String getDeptCode() {
        return deptCode;
    }
    
    public void setDeptCode(String deptCode) {
        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Department code must be alphanumeric and at least 3 characters");
        }
        this.deptCode = deptCode;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Code: " + deptCode);
    }
}

