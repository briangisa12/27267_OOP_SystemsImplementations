package q4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ProcurementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== PROCUREMENT MANAGEMENT SYSTEM [27267] ==========");
        System.out.println("Enter Procurement Details:\n");
        
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            LocalDateTime now = LocalDateTime.now();
            
            System.out.print("Enter Organization Name: ");
            String orgName = scanner.nextLine();
            
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String deptName = scanner.nextLine();
            
            System.out.print("Enter Department Code (alphanumeric, min 3 chars): ");
            String deptCode = scanner.nextLine();
            
            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();
            
            System.out.print("Enter Supplier TIN (9 digits): ");
            String supplierTIN = scanner.nextLine();
            
            System.out.print("Enter Contact (10 digits): ");
            String contact = scanner.nextLine();
            
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            
            System.out.print("Enter Unit Price: ");
            double unitPrice = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter PO Number: ");
            String poNumber = scanner.nextLine();
            
            System.out.print("Enter Order Date (YYYY-MM-DD): ");
            String orderDateStr = scanner.nextLine();
            LocalDateTime orderDate = LocalDateTime.parse(orderDateStr + "T00:00:00");
            
            System.out.print("Enter Total Amount: ");
            double totalAmount = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Delivery Date (YYYY-MM-DD): ");
            String deliveryDateStr = scanner.nextLine();
            LocalDateTime deliveryDate = LocalDateTime.parse(deliveryDateStr + "T00:00:00");
            
            System.out.print("Enter Delivered By: ");
            String deliveredBy = scanner.nextLine();
            
            System.out.print("Enter Inspector Name: ");
            String inspectorName = scanner.nextLine();
            
            System.out.print("Enter Status (Passed/Failed): ");
            String status = scanner.nextLine();
            
            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();
            
            System.out.print("Enter Invoice No: ");
            String invoiceNo = scanner.nextLine();
            
            System.out.print("Enter Invoice Amount: ");
            double invoiceAmount = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Report Date (YYYY-MM-DD): ");
            String reportDateStr = scanner.nextLine();
            LocalDateTime reportDate = LocalDateTime.parse(reportDateStr + "T00:00:00");
            
            System.out.print("Enter Summary: ");
            String summary = scanner.nextLine();
            
            ProcurementReport report = new ProcurementReport(
                id, now, now,
                orgName, address, contactEmail,
                deptName, deptCode,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy,
                inspectorName, status, remarks,
                invoiceNo, invoiceAmount,
                reportDate, summary
            );
            
            System.out.println("\n========== ALL INSERTED DATA [27267] ==========");
            report.displayInfo();
            System.out.println("\n");
            System.out.println("========== TOTAL PURCHASE CALCULATION [27267] ==========");
            double total = report.calculateTotal();
            System.out.println("Total of All Invoice Amounts: " + total);
            System.out.println("======================================================\n");
            
        } catch (Exception e) {
            System.out.println("Error [27267]: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

