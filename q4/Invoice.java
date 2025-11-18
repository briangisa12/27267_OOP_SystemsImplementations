package q4;

import java.time.LocalDateTime;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount;
    
    public Invoice(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, LocalDateTime orderDate, double totalAmount,
                   LocalDateTime deliveryDate, String deliveredBy,
                   String inspectorName, String status, String remarks,
                   String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
              deliveryDate, deliveredBy, inspectorName, status, remarks);
        if (invoiceAmount <= 0) {
            throw new IllegalArgumentException("Invoice amount must be greater than 0");
        }
        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
    }
    
    public String getInvoiceNo() {
        return invoiceNo;
    }
    
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    
    public double getInvoiceAmount() {
        return invoiceAmount;
    }
    
    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount <= 0) {
            throw new IllegalArgumentException("Invoice amount must be greater than 0");
        }
        this.invoiceAmount = invoiceAmount;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Invoice No: " + invoiceNo);
        System.out.println("Invoice Amount: " + invoiceAmount);
    }
}

