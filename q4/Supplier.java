package q4;

import java.time.LocalDateTime;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;
    
    public Supplier(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode);
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}")) {
            throw new IllegalArgumentException("Supplier TIN must be exactly 9 digits");
        }
        if (contact == null || !contact.matches("\\d{10}")) {
            throw new IllegalArgumentException("Contact must be exactly 10 digits");
        }
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }
    
    public String getSupplierName() {
        return supplierName;
    }
    
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    public String getSupplierTIN() {
        return supplierTIN;
    }
    
    public void setSupplierTIN(String supplierTIN) {
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}")) {
            throw new IllegalArgumentException("Supplier TIN must be exactly 9 digits");
        }
        this.supplierTIN = supplierTIN;
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
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Supplier TIN: " + supplierTIN);
        System.out.println("Contact: " + contact);
    }
}

