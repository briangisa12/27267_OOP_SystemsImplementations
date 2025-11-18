package q1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StockManagementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== STOCK MANAGEMENT SYSTEM [27267] ==========");
        System.out.println("Enter Stock Management Details:\n");
        
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            LocalDateTime now = LocalDateTime.now();
            
            System.out.print("Enter Warehouse Name: ");
            String warehouseName = scanner.nextLine();
            
            System.out.print("Enter Location: ");
            String location = scanner.nextLine();
            
            System.out.print("Enter Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();
            
            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();
            
            System.out.print("Enter Category Code (alphanumeric, min 3 chars): ");
            String categoryCode = scanner.nextLine();
            
            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();
            
            System.out.print("Enter Supplier Email: ");
            String supplierEmail = scanner.nextLine();
            
            System.out.print("Enter Supplier Phone (10 digits): ");
            String supplierPhone = scanner.nextLine();
            
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            
            System.out.print("Enter Unit Price: ");
            double unitPrice = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Stock Limit: ");
            int stockLimit = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Quantity Available: ");
            int quantityAvailable = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Reorder Level: ");
            int reorderLevel = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Purchase Date (YYYY-MM-DD): ");
            String purchaseDateStr = scanner.nextLine();
            LocalDateTime purchaseDate = LocalDateTime.parse(purchaseDateStr + "T00:00:00");
            
            System.out.print("Enter Purchased Quantity: ");
            int purchasedQuantity = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Supplier Name for Purchase: ");
            String supplierNamePurchase = scanner.nextLine();
            
            System.out.print("Enter Sale Date (YYYY-MM-DD): ");
            String saleDateStr = scanner.nextLine();
            LocalDateTime saleDate = LocalDateTime.parse(saleDateStr + "T00:00:00");
            
            System.out.print("Enter Sold Quantity: ");
            int soldQuantity = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("Enter Total Items: ");
            int totalItems = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Stock Value: ");
            double stockValue = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Report Date (YYYY-MM-DD): ");
            String reportDateStr = scanner.nextLine();
            LocalDateTime reportDate = LocalDateTime.parse(reportDateStr + "T00:00:00");
            
            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();
            
            StockReport report = new StockReport(
                id, now, now,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, supplierNamePurchase,
                saleDate, soldQuantity, customerName,
                totalItems, stockValue,
                reportDate, remarks
            );
            
            System.out.println("\n========== ALL INSERTED DATA [27267] ==========");
            report.displayInfo();
            System.out.println("\n");
            report.generateReport();
            
        } catch (Exception e) {
            System.out.println("Error [27267]: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

