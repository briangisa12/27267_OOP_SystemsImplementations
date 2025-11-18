package q1;

import java.time.LocalDateTime;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;
    
    public Inventory(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel,
                     LocalDateTime purchaseDate, int purchasedQuantity, String supplierNamePurchase,
                     LocalDateTime saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, supplierNamePurchase,
              saleDate, soldQuantity, customerName);
        if (totalItems < 0) {
            throw new IllegalArgumentException("Total items must be greater than or equal to 0");
        }
        if (stockValue < 0) {
            throw new IllegalArgumentException("Stock value must be greater than or equal to 0");
        }
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }
    
    public int getTotalItems() {
        return totalItems;
    }
    
    public void setTotalItems(int totalItems) {
        if (totalItems < 0) {
            throw new IllegalArgumentException("Total items must be greater than or equal to 0");
        }
        this.totalItems = totalItems;
    }
    
    public double getStockValue() {
        return stockValue;
    }
    
    public void setStockValue(double stockValue) {
        if (stockValue < 0) {
            throw new IllegalArgumentException("Stock value must be greater than or equal to 0");
        }
        this.stockValue = stockValue;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Items: " + totalItems);
        System.out.println("Stock Value: " + stockValue);
    }
}

