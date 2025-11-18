package q4;

import java.time.LocalDateTime;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status;
    private String remarks;
    
    public Inspection(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, LocalDateTime orderDate, double totalAmount,
                      LocalDateTime deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
              deliveryDate, deliveredBy);
        if (!status.equals("Passed") && !status.equals("Failed")) {
            throw new IllegalArgumentException("Status must be 'Passed' or 'Failed'");
        }
        this.inspectorName = inspectorName;
        this.status = status;
        this.remarks = remarks;
    }
    
    public String getInspectorName() {
        return inspectorName;
    }
    
    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        if (!status.equals("Passed") && !status.equals("Failed")) {
            throw new IllegalArgumentException("Status must be 'Passed' or 'Failed'");
        }
        this.status = status;
    }
    
    public String getRemarks() {
        return remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Inspector Name: " + inspectorName);
        System.out.println("Status: " + status);
        System.out.println("Remarks: " + remarks);
    }
}

