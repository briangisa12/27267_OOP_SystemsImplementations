package q2;

import java.time.LocalDateTime;

public class Booking extends Passenger {
    private LocalDateTime bookingDate;
    private String seatNumber;
    private String travelClass;
    
    public Booking(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   LocalDateTime bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare,
              pilotName, licenseNumber, experienceYears,
              crewName, role, shift,
              passengerName, age, gender, contact);
        if (!travelClass.equals("Economy") && !travelClass.equals("Business") && !travelClass.equals("First")) {
            throw new IllegalArgumentException("Travel class must be 'Economy', 'Business', or 'First'");
        }
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }
    
    public LocalDateTime getBookingDate() {
        return bookingDate;
    }
    
    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }
    
    public String getSeatNumber() {
        return seatNumber;
    }
    
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    public String getTravelClass() {
        return travelClass;
    }
    
    public void setTravelClass(String travelClass) {
        if (!travelClass.equals("Economy") && !travelClass.equals("Business") && !travelClass.equals("First")) {
            throw new IllegalArgumentException("Travel class must be 'Economy', 'Business', or 'First'");
        }
        this.travelClass = travelClass;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Booking Date: " + bookingDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Travel Class: " + travelClass);
    }
}

