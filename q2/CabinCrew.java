package q2;

import java.time.LocalDateTime;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;
    
    public CabinCrew(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare,
              pilotName, licenseNumber, experienceYears);
        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role must not be empty");
        }
        if (!shift.equals("Day") && !shift.equals("Night")) {
            throw new IllegalArgumentException("Shift must be 'Day' or 'Night'");
        }
        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }
    
    public String getCrewName() {
        return crewName;
    }
    
    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role must not be empty");
        }
        this.role = role;
    }
    
    public String getShift() {
        return shift;
    }
    
    public void setShift(String shift) {
        if (!shift.equals("Day") && !shift.equals("Night")) {
            throw new IllegalArgumentException("Shift must be 'Day' or 'Night'");
        }
        this.shift = shift;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Crew Name: " + crewName);
        System.out.println("Role: " + role);
        System.out.println("Shift: " + shift);
    }
}

