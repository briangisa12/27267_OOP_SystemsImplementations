package q5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AttendanceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== ATTENDANCE MANAGEMENT SYSTEM [27267] ==========");
        System.out.println("Enter Attendance Details:\n");
        
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            LocalDateTime now = LocalDateTime.now();
            
            System.out.print("Enter Institution Name: ");
            String institutionName = scanner.nextLine();
            
            System.out.print("Enter Code (min 3 chars): ");
            String code = scanner.nextLine();
            
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print("Enter Department Head: ");
            String departmentHead = scanner.nextLine();
            
            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine();
            
            System.out.print("Enter Course Code: ");
            String courseCode = scanner.nextLine();
            
            System.out.print("Enter Credits: ");
            int credits = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Instructor Name: ");
            String instructorName = scanner.nextLine();
            
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter Phone (10 digits): ");
            String phone = scanner.nextLine();
            
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            
            System.out.print("Enter Student ID: ");
            String studentID = scanner.nextLine();
            
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Session Date (YYYY-MM-DD): ");
            String sessionDateStr = scanner.nextLine();
            LocalDateTime sessionDate = LocalDateTime.parse(sessionDateStr + "T00:00:00");
            
            System.out.print("Enter Topic: ");
            String topic = scanner.nextLine();
            
            System.out.print("Enter Student ID Record: ");
            String studentIDRecord = scanner.nextLine();
            
            System.out.print("Enter Session ID: ");
            String sessionID = scanner.nextLine();
            
            System.out.print("Enter Status (Present/Absent): ");
            String status = scanner.nextLine();
            
            System.out.print("Enter Request Date (YYYY-MM-DD): ");
            String requestDateStr = scanner.nextLine();
            LocalDateTime requestDate = LocalDateTime.parse(requestDateStr + "T00:00:00");
            
            System.out.print("Enter Reason: ");
            String reason = scanner.nextLine();
            
            System.out.print("Enter Approved (true/false): ");
            boolean approved = Boolean.parseBoolean(scanner.nextLine());
            
            System.out.print("Enter Report Date (YYYY-MM-DD): ");
            String reportDateStr = scanner.nextLine();
            LocalDateTime reportDate = LocalDateTime.parse(reportDateStr + "T00:00:00");
            
            System.out.print("Enter Total Present: ");
            int totalPresent = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Total Absent: ");
            int totalAbsent = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Total Sessions: ");
            int totalSessions = Integer.parseInt(scanner.nextLine());
            
            AttendanceSummary summary = new AttendanceSummary(
                id, now, now,
                institutionName, code, address,
                departmentName, departmentHead,
                courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic,
                studentIDRecord, sessionID, status,
                requestDate, reason, approved,
                reportDate, totalPresent, totalAbsent, totalSessions
            );
            
            System.out.println("\n========== ALL INSERTED DATA [27267] ==========");
            summary.displayInfo();
            System.out.println("\n");
            System.out.println("========== ATTENDANCE SUMMARY [27267] ==========");
            double attendanceRate = summary.generateSummary();
            System.out.println("Total Present: " + summary.getTotalPresent());
            System.out.println("Total Absent: " + summary.getTotalAbsent());
            System.out.println("Total Sessions: " + summary.getTotalSessions());
            System.out.println("Attendance Rate: " + String.format("%.2f", attendanceRate) + "%");
            System.out.println("===============================================\n");
            
        } catch (Exception e) {
            System.out.println("Error [27267]: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

