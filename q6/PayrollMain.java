package q6;

import java.time.LocalDateTime;
import java.util.Scanner;

public class PayrollMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== PAYROLL MANAGEMENT SYSTEM (RSSB) [27267] ==========");
        System.out.println("Enter Payroll Details:\n");
        
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            LocalDateTime now = LocalDateTime.now();
            
            System.out.print("Enter Organization Name: ");
            String orgName = scanner.nextLine();
            
            System.out.print("Enter Organization Code (min 3 chars): ");
            String orgCode = scanner.nextLine();
            
            System.out.print("Enter RSSB Number (8 digits): ");
            String rssbNumber = scanner.nextLine();
            
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String deptName = scanner.nextLine();
            
            System.out.print("Enter Department Code (min 3 chars): ");
            String deptCode = scanner.nextLine();
            
            System.out.print("Enter Manager Name: ");
            String managerName = scanner.nextLine();
            
            System.out.print("Enter Employee ID (>= 1000): ");
            String employeeID = scanner.nextLine();
            
            System.out.print("Enter Full Name: ");
            String fullName = scanner.nextLine();
            
            System.out.print("Enter Position: ");
            String position = scanner.nextLine();
            
            System.out.print("Enter Base Salary: ");
            double baseSalary = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter RSSB Registered (true/false): ");
            boolean rssbRegistered = Boolean.parseBoolean(scanner.nextLine());
            
            System.out.print("Enter Month (1-12): ");
            int month = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Year (>= 2000): ");
            int year = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Start Date (YYYY-MM-DD): ");
            String startDateStr = scanner.nextLine();
            LocalDateTime startDate = LocalDateTime.parse(startDateStr + "T00:00:00");
            
            System.out.print("Enter End Date (YYYY-MM-DD): ");
            String endDateStr = scanner.nextLine();
            LocalDateTime endDate = LocalDateTime.parse(endDateStr + "T00:00:00");
            
            System.out.print("Enter Basic Pay: ");
            double basicPay = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Transport Allowance: ");
            double transportAllowance = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Housing Allowance: ");
            double housingAllowance = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter RSSB Contribution (must be 5% of basic pay): ");
            double rssbContribution = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter PAYE Tax: ");
            double payeTax = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Loan Deduction: ");
            double loanDeduction = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Overtime Hours: ");
            double overtimeHours = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Overtime Rate: ");
            double overtimeRate = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Bonus: ");
            double bonus = Double.parseDouble(scanner.nextLine());
            
            // Calculate gross salary
            double grossSalary = basicPay + transportAllowance + housingAllowance + 
                              (overtimeHours * overtimeRate) + bonus;
            
            // Calculate total deductions
            double totalDeductions = rssbContribution + payeTax + loanDeduction;
            
            // Calculate net salary
            double netSalary = grossSalary - totalDeductions;
            
            System.out.print("Enter Payslip Number: ");
            String payslipNumber = scanner.nextLine();
            
            System.out.print("Enter Issue Date (YYYY-MM-DD): ");
            String issueDateStr = scanner.nextLine();
            LocalDateTime issueDate = LocalDateTime.parse(issueDateStr + "T00:00:00");
            
            Payslip payslip = new Payslip(
                id, now, now,
                orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance,
                rssbContribution, payeTax, loanDeduction,
                overtimeHours, overtimeRate, bonus,
                grossSalary, totalDeductions, netSalary,
                payslipNumber, issueDate
            );
            
            System.out.println("\n========== ALL INSERTED DATA [27267] ==========");
            payslip.displayInfo();
            System.out.println("\n");
            payslip.generatePayslip();
            
        } catch (Exception e) {
            System.out.println("Error [27267]: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

