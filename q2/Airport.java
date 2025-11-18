package q2;

import java.time.LocalDateTime;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;
    
    public Airport(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        if (code == null || !code.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Airport code must be exactly 3 uppercase letters");
        }
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }
    
    public String getAirportName() {
        return airportName;
    }
    
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        if (code == null || !code.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Airport code must be exactly 3 uppercase letters");
        }
        this.code = code;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Airport Name: " + airportName);
        System.out.println("Code: " + code);
        System.out.println("Location: " + location);
    }
}

