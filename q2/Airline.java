package q2;

import java.time.LocalDateTime;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;
    
    public Airline(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        if (airlineCode == null || airlineCode.length() < 2 || airlineCode.length() > 4 || !airlineCode.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException("Airline code must be 2-4 letters");
        }
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }
    
    public String getAirlineName() {
        return airlineName;
    }
    
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
    
    public String getAirlineCode() {
        return airlineCode;
    }
    
    public void setAirlineCode(String airlineCode) {
        if (airlineCode == null || airlineCode.length() < 2 || airlineCode.length() > 4 || !airlineCode.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException("Airline code must be 2-4 letters");
        }
        this.airlineCode = airlineCode;
    }
    
    public String getContactEmail() {
        return contactEmail;
    }
    
    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.contactEmail = contactEmail;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Airline Name: " + airlineName);
        System.out.println("Airline Code: " + airlineCode);
        System.out.println("Contact Email: " + contactEmail);
    }
}

