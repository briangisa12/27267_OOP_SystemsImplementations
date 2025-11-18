package q5;

import java.time.LocalDateTime;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;
    
    public Department(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);
        if (departmentName == null || departmentName.isEmpty()) {
            throw new IllegalArgumentException("Department name must not be empty");
        }
        if (departmentHead == null || departmentHead.isEmpty()) {
            throw new IllegalArgumentException("Department head must not be empty");
        }
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        if (departmentName == null || departmentName.isEmpty()) {
            throw new IllegalArgumentException("Department name must not be empty");
        }
        this.departmentName = departmentName;
    }
    
    public String getDepartmentHead() {
        return departmentHead;
    }
    
    public void setDepartmentHead(String departmentHead) {
        if (departmentHead == null || departmentHead.isEmpty()) {
            throw new IllegalArgumentException("Department head must not be empty");
        }
        this.departmentHead = departmentHead;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department Name: " + departmentName);
        System.out.println("Department Head: " + departmentHead);
    }
}

