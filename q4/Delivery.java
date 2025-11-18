package q4;

import java.time.LocalDateTime;

public class Delivery extends PurchaseOrder {
    private LocalDateTime deliveryDate;
    private String deliveredBy;
    
    public Delivery(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, LocalDateTime orderDate, double totalAmount,
                    LocalDateTime deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        if (deliveryDate == null) {
            throw new IllegalArgumentException("Delivery date must not be null");
        }
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }
    
    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }
    
    public void setDeliveryDate(LocalDateTime deliveryDate) {
        if (deliveryDate == null) {
            throw new IllegalArgumentException("Delivery date must not be null");
        }
        this.deliveryDate = deliveryDate;
    }
    
    public String getDeliveredBy() {
        return deliveredBy;
    }
    
    public void setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Delivered By: " + deliveredBy);
    }
}

