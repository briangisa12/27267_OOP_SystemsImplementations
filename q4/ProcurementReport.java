package q4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class ProcurementReport extends Invoice {
    private LocalDateTime reportDate;
    private String summary;
    private static double totalInvoiceAmount = 0;
    
    public ProcurementReport(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, LocalDateTime orderDate, double totalAmount,
                             LocalDateTime deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             LocalDateTime reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
              deliveryDate, deliveredBy, inspectorName, status, remarks,
              invoiceNo, invoiceAmount);
        this.reportDate = reportDate;
        this.summary = summary;
        totalInvoiceAmount += invoiceAmount;
    }
    
    public LocalDateTime getReportDate() {
        return reportDate;
    }
    
    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }
    
    public String getSummary() {
        return summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    public double calculateTotal() {
        return totalInvoiceAmount;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Report Date: " + reportDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Summary: " + summary);
    }
}

