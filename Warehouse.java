package q1;

import java.time.LocalDateTime;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;
    
    public Warehouse(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Contact number must be exactly 10 digits");
        }
        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }
    
    public String getWarehouseName() {
        return warehouseName;
    }
    
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Contact number must be exactly 10 digits");
        }
        this.contactNumber = contactNumber;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warehouse Name: " + warehouseName);
        System.out.println("Location: " + location);
        System.out.println("Contact Number: " + contactNumber);
    }
}

