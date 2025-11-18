package q5;

import java.time.LocalDateTime;

public class ClassSession extends Student {
    private LocalDateTime sessionDate;
    private String topic;
    
    public ClassSession(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        LocalDateTime sessionDate, String topic) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age);
        if (sessionDate == null) {
            throw new IllegalArgumentException("Session date must not be null");
        }
        this.sessionDate = sessionDate;
        this.topic = topic;
    }
    
    public LocalDateTime getSessionDate() {
        return sessionDate;
    }
    
    public void setSessionDate(LocalDateTime sessionDate) {
        if (sessionDate == null) {
            throw new IllegalArgumentException("Session date must not be null");
        }
        this.sessionDate = sessionDate;
    }
    
    public String getTopic() {
        return topic;
    }
    
    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Session Date: " + sessionDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Topic: " + topic);
    }
}

