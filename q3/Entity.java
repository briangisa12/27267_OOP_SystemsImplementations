package q3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entity {
    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    
    public Entity(int id, LocalDateTime createdDate, LocalDateTime updatedDate) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
        this.id = id;
    }
    
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
    
    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }
    
    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    public void displayInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("ID: " + id);
        System.out.println("Created Date: " + createdDate.format(formatter));
        System.out.println("Updated Date: " + updatedDate.format(formatter));
    }
}

