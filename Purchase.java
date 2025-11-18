package q1;

import java.time.LocalDateTime;

public class Purchase extends StockItem {
    private LocalDateTime purchaseDate;
    private int purchasedQuantity;
    private String supplierName;
    
    public Purchase(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    LocalDateTime purchaseDate, int purchasedQuantity, String supplierNamePurchase) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        if (purchaseDate == null) {
            throw new IllegalArgumentException("Purchase date must not be null");
        }
        if (purchasedQuantity <= 0) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0");
        }
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName = supplierNamePurchase;
    }
    
    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }
    
    public void setPurchaseDate(LocalDateTime purchaseDate) {
        if (purchaseDate == null) {
            throw new IllegalArgumentException("Purchase date must not be null");
        }
        this.purchaseDate = purchaseDate;
    }
    
    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }
    
    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0");
        }
        this.purchasedQuantity = purchasedQuantity;
    }
    
    public String getSupplierName() {
        return supplierName;
    }
    
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Purchase Date: " + purchaseDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Purchased Quantity: " + purchasedQuantity);
        System.out.println("Supplier Name: " + supplierName);
    }
}

