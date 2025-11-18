package q1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class StockReport extends Inventory {
    private LocalDateTime reportDate;
    private String remarks;
    
    public StockReport(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                       String warehouseName, String location, String contactNumber,
                       String categoryName, String categoryCode,
                       String supplierName, String supplierEmail, String supplierPhone,
                       String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       LocalDateTime purchaseDate, int purchasedQuantity, String supplierNamePurchase,
                       LocalDateTime saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       LocalDateTime reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, supplierNamePurchase,
              saleDate, soldQuantity, customerName, totalItems, stockValue);
        this.reportDate = reportDate;
        this.remarks = remarks;
    }
    
    public LocalDateTime getReportDate() {
        return reportDate;
    }
    
    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }
    
    public String getRemarks() {
        return remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public void generateReport() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("\n========== STOCK REPORT [27267] ==========");
        System.out.println("Report Date: " + reportDate.format(formatter));
        System.out.println("Remarks: " + remarks);
        System.out.println("\n--- Summary ---");
        System.out.println("Total Stock Items: " + getTotalItems());
        System.out.println("Total Stock Value: " + getStockValue());
        System.out.println("Total Sales Quantity: " + getSoldQuantity());
        System.out.println("Sales Revenue: " + (getSoldQuantity() * getUnitPrice()));
        System.out.println("==========================================\n");
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Report Date: " + reportDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Remarks: " + remarks);
    }
}

