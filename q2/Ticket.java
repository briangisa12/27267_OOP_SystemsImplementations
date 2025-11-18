package q2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Ticket extends Payment {
    private String ticketNumber;
    private LocalDateTime issueDate;
    
    public Ticket(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  LocalDateTime bookingDate, String seatNumber, String travelClass,
                  LocalDateTime paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, LocalDateTime issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare,
              pilotName, licenseNumber, experienceYears,
              crewName, role, shift,
              passengerName, age, gender, contact,
              bookingDate, seatNumber, travelClass,
              paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }
    
    public String getTicketNumber() {
        return ticketNumber;
    }
    
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    
    public LocalDateTime getIssueDate() {
        return issueDate;
    }
    
    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }
    
    public double calculateFare() {
        double baseFare = getBaseFare();
        double taxes = baseFare * 0.15; // 15% tax
        double discounts = 0;
        
        // Apply discounts based on travel class
        if (getTravelClass().equals("Business")) {
            discounts = baseFare * 0.10; // 10% discount
        } else if (getTravelClass().equals("First")) {
            discounts = baseFare * 0.15; // 15% discount
        }
        
        double finalFare = baseFare + taxes - discounts;
        return finalFare;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Issue Date: " + issueDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

