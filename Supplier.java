package q1;

import java.time.LocalDateTime;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;
    
    public Supplier(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode);
        if (supplierEmail == null || !supplierEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Supplier phone must be exactly 10 digits");
        }
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }
    
    public String getSupplierName() {
        return supplierName;
    }
    
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    public String getSupplierEmail() {
        return supplierEmail;
    }
    
    public void setSupplierEmail(String supplierEmail) {
        if (supplierEmail == null || !supplierEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.supplierEmail = supplierEmail;
    }
    
    public String getSupplierPhone() {
        return supplierPhone;
    }
    
    public void setSupplierPhone(String supplierPhone) {
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Supplier phone must be exactly 10 digits");
        }
        this.supplierPhone = supplierPhone;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Supplier Email: " + supplierEmail);
        System.out.println("Supplier Phone: " + supplierPhone);
    }
}

