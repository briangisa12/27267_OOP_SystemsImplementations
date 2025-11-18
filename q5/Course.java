package q5;

import java.time.LocalDateTime;

public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;
    
    public Course(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                  String institutionName, String code, String address,
                  String departmentName, String departmentHead,
                  String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead);
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be greater than 0");
        }
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public void setCredits(int credits) {
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be greater than 0");
        }
        this.credits = credits;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credits: " + credits);
    }
}

