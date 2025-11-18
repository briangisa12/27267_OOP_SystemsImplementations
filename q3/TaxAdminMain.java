package q3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TaxAdminMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== TAX ADMINISTRATION SYSTEM [27267] ==========");
        System.out.println("Enter Tax Administration Details:\n");
        
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            LocalDateTime now = LocalDateTime.now();
            
            System.out.print("Enter Authority Name: ");
            String authorityName = scanner.nextLine();
            
            System.out.print("Enter Region: ");
            String region = scanner.nextLine();
            
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();
            
            System.out.print("Enter Rate: ");
            double rate = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Code (min 3 chars): ");
            String code = scanner.nextLine();
            
            System.out.print("Enter TIN (9 digits): ");
            String tin = scanner.nextLine();
            
            System.out.print("Enter Taxpayer Name: ");
            String taxpayerName = scanner.nextLine();
            
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Employer Name: ");
            String employerName = scanner.nextLine();
            
            System.out.print("Enter Employer TIN (9 digits): ");
            String employerTIN = scanner.nextLine();
            
            System.out.print("Enter Contact (10 digits): ");
            String contact = scanner.nextLine();
            
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            
            System.out.print("Enter Salary: ");
            double salary = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Employee TIN (9 digits): ");
            String employeeTIN = scanner.nextLine();
            
            System.out.print("Enter Declaration Month: ");
            String declarationMonth = scanner.nextLine();
            
            System.out.print("Enter Total Income: ");
            double totalIncome = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Assessment Date (YYYY-MM-DD): ");
            String assessmentDateStr = scanner.nextLine();
            LocalDateTime assessmentDate = LocalDateTime.parse(assessmentDateStr + "T00:00:00");
            
            System.out.print("Enter Assessed Tax: ");
            double assessedTax = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Payment Date (YYYY-MM-DD): ");
            String paymentDateStr = scanner.nextLine();
            LocalDateTime paymentDate = LocalDateTime.parse(paymentDateStr + "T00:00:00");
            
            System.out.print("Enter Payment Amount: ");
            double paymentAmount = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Receipt No: ");
            String receiptNo = scanner.nextLine();
            
            System.out.print("Enter Total Tax: ");
            double totalTax = Double.parseDouble(scanner.nextLine());
            
            TaxRecord record = new TaxRecord(
                id, now, now,
                authorityName, region, email,
                categoryName, rate, code,
                tin, taxpayerName, address,
                employerName, employerTIN, contact,
                employeeName, salary, employeeTIN,
                declarationMonth, totalIncome,
                assessmentDate, assessedTax,
                paymentDate, paymentAmount,
                receiptNo, totalTax
            );
            
            System.out.println("\n========== ALL INSERTED DATA [27267] ==========");
            record.displayInfo();
            System.out.println("\n");
            System.out.println("========== TAX COMPUTATION [27267] ==========");
            double computedTax = record.computeTax();
            System.out.println("Salary: " + record.getSalary());
            System.out.println("Tax Rate: " + record.getRate() + "%");
            System.out.println("Computed Tax: " + computedTax);
            System.out.println("=============================================\n");
            
        } catch (Exception e) {
            System.out.println("Error [27267]: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

