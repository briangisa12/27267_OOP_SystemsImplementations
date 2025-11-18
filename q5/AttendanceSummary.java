package q5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class AttendanceSummary extends LeaveRequest {
    private LocalDateTime reportDate;
    private int totalPresent;
    private int totalAbsent;
    private int totalSessions;
    
    public AttendanceSummary(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                              String institutionName, String code, String address,
                              String departmentName, String departmentHead,
                              String courseName, String courseCode, int credits,
                              String instructorName, String email, String phone,
                              String studentName, String studentID, int age,
                              LocalDateTime sessionDate, String topic,
                              String studentIDRecord, String sessionID, String status,
                              LocalDateTime requestDate, String reason, boolean approved,
                              LocalDateTime reportDate, int totalPresent, int totalAbsent, int totalSessions) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age,
              sessionDate, topic, studentIDRecord, sessionID, status,
              requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
        this.totalSessions = totalSessions;
    }
    
    public LocalDateTime getReportDate() {
        return reportDate;
    }
    
    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }
    
    public int getTotalPresent() {
        return totalPresent;
    }
    
    public void setTotalPresent(int totalPresent) {
        this.totalPresent = totalPresent;
    }
    
    public int getTotalAbsent() {
        return totalAbsent;
    }
    
    public void setTotalAbsent(int totalAbsent) {
        this.totalAbsent = totalAbsent;
    }
    
    public int getTotalSessions() {
        return totalSessions;
    }
    
    public void setTotalSessions(int totalSessions) {
        this.totalSessions = totalSessions;
    }
    
    public double generateSummary() {
        if (totalSessions == 0) {
            return 0.0;
        }
        return (double) totalPresent / totalSessions * 100;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Report Date: " + reportDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        System.out.println("Total Sessions: " + totalSessions);
    }
}

