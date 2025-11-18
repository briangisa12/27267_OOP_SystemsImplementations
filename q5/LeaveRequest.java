package q5;

import java.time.LocalDateTime;

public class LeaveRequest extends AttendanceRecord {
    private LocalDateTime requestDate;
    private String reason;
    private boolean approved;
    
    public LeaveRequest(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        LocalDateTime sessionDate, String topic,
                        String studentIDRecord, String sessionID, String status,
                        LocalDateTime requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age,
              sessionDate, topic, studentIDRecord, sessionID, status);
        if (reason == null || reason.isEmpty()) {
            throw new IllegalArgumentException("Reason must not be empty");
        }
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }
    
    public LocalDateTime getRequestDate() {
        return requestDate;
    }
    
    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        if (reason == null || reason.isEmpty()) {
            throw new IllegalArgumentException("Reason must not be empty");
        }
        this.reason = reason;
    }
    
    public boolean isApproved() {
        return approved;
    }
    
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Request Date: " + requestDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Reason: " + reason);
        System.out.println("Approved: " + approved);
    }
}

