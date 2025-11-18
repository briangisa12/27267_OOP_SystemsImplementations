package q4;

import java.time.LocalDateTime;

public class PurchaseOrder extends Product {
    private String poNumber;
    private LocalDateTime orderDate;
    private double totalAmount;
    
    public PurchaseOrder(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                         String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, LocalDateTime orderDate, double totalAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity);
        if (totalAmount <= 0) {
            throw new IllegalArgumentException("Total amount must be greater than 0");
        }
        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }
    
    public String getPoNumber() {
        return poNumber;
    }
    
    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }
    
    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }
    
    public void setTotalAmount(double totalAmount) {
        if (totalAmount <= 0) {
            throw new IllegalArgumentException("Total amount must be greater than 0");
        }
        this.totalAmount = totalAmount;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("PO Number: " + poNumber);
        System.out.println("Order Date: " + orderDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Total Amount: " + totalAmount);
    }
}

