package q1;

import java.time.LocalDateTime;

public class Sale extends Purchase {
    private LocalDateTime saleDate;
    private int soldQuantity;
    private String customerName;
    
    public Sale(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                String warehouseName, String location, String contactNumber,
                String categoryName, String categoryCode,
                String supplierName, String supplierEmail, String supplierPhone,
                String productName, double unitPrice, int stockLimit,
                int quantityAvailable, int reorderLevel,
                LocalDateTime purchaseDate, int purchasedQuantity, String supplierNamePurchase,
                LocalDateTime saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, supplierNamePurchase);
        if (saleDate == null) {
            throw new IllegalArgumentException("Sale date must not be null");
        }
        if (soldQuantity <= 0) {
            throw new IllegalArgumentException("Sold quantity must be greater than 0");
        }
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }
    
    public LocalDateTime getSaleDate() {
        return saleDate;
    }
    
    public void setSaleDate(LocalDateTime saleDate) {
        if (saleDate == null) {
            throw new IllegalArgumentException("Sale date must not be null");
        }
        this.saleDate = saleDate;
    }
    
    public int getSoldQuantity() {
        return soldQuantity;
    }
    
    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity <= 0) {
            throw new IllegalArgumentException("Sold quantity must be greater than 0");
        }
        this.soldQuantity = soldQuantity;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sale Date: " + saleDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Sold Quantity: " + soldQuantity);
        System.out.println("Customer Name: " + customerName);
    }
}

