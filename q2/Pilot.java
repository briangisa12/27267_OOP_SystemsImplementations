package q2;

import java.time.LocalDateTime;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;
    
    public Pilot(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                 String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare);
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new IllegalArgumentException("License number must not be empty");
        }
        if (experienceYears < 2) {
            throw new IllegalArgumentException("Experience years must be at least 2");
        }
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }
    
    public String getPilotName() {
        return pilotName;
    }
    
    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }
    
    public String getLicenseNumber() {
        return licenseNumber;
    }
    
    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new IllegalArgumentException("License number must not be empty");
        }
        this.licenseNumber = licenseNumber;
    }
    
    public int getExperienceYears() {
        return experienceYears;
    }
    
    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 2) {
            throw new IllegalArgumentException("Experience years must be at least 2");
        }
        this.experienceYears = experienceYears;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pilot Name: " + pilotName);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Experience Years: " + experienceYears);
    }
}

