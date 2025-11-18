package q6;

import java.time.LocalDateTime;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;
    
    public Department(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptCode == null || deptCode.length() < 3) {
            throw new IllegalArgumentException("Department code must be at least 3 characters");
        }
        if (managerName == null || managerName.isEmpty()) {
            throw new IllegalArgumentException("Manager name must not be empty");
        }
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
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
        if (deptCode == null || deptCode.length() < 3) {
            throw new IllegalArgumentException("Department code must be at least 3 characters");
        }
        this.deptCode = deptCode;
    }
    
    public String getManagerName() {
        return managerName;
    }
    
    public void setManagerName(String managerName) {
        if (managerName == null || managerName.isEmpty()) {
            throw new IllegalArgumentException("Manager name must not be empty");
        }
        this.managerName = managerName;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Code: " + deptCode);
        System.out.println("Manager Name: " + managerName);
    }
}

