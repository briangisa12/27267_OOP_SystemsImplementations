package q5;

import java.time.LocalDateTime;

public class AttendanceRecord extends ClassSession {
    private String studentIDRecord;
    private String sessionID;
    private String status;
    
    public AttendanceRecord(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                             String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             LocalDateTime sessionDate, String topic,
                             String studentIDRecord, String sessionID, String status) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age,
              sessionDate, topic);
        if (!status.equals("Present") && !status.equals("Absent")) {
            throw new IllegalArgumentException("Status must be 'Present' or 'Absent'");
        }
        this.studentIDRecord = studentIDRecord;
        this.sessionID = sessionID;
        this.status = status;
    }
    
    public String getStudentIDRecord() {
        return studentIDRecord;
    }
    
    public void setStudentIDRecord(String studentIDRecord) {
        this.studentIDRecord = studentIDRecord;
    }
    
    public String getSessionID() {
        return sessionID;
    }
    
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        if (!status.equals("Present") && !status.equals("Absent")) {
            throw new IllegalArgumentException("Status must be 'Present' or 'Absent'");
        }
        this.status = status;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID Record: " + studentIDRecord);
        System.out.println("Session ID: " + sessionID);
        System.out.println("Status: " + status);
    }
}

