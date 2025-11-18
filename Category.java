package q1;

import java.time.LocalDateTime;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;
    
    public Category(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);
        if (categoryCode == null || categoryCode.length() < 3 || !categoryCode.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Category code must be alphanumeric and at least 3 characters");
        }
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public String getCategoryCode() {
        return categoryCode;
    }
    
    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || categoryCode.length() < 3 || !categoryCode.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Category code must be alphanumeric and at least 3 characters");
        }
        this.categoryCode = categoryCode;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category Name: " + categoryName);
        System.out.println("Category Code: " + categoryCode);
    }
}

