package q5;

import java.time.LocalDateTime;

public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;
    
    public Student(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String institutionName, String code, String address,
                   String departmentName, String departmentHead,
                   String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone);
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.age = age;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
    }
}

