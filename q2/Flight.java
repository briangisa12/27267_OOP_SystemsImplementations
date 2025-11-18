package q2;

import java.time.LocalDateTime;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;
    
    public Flight(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare) {
        super(id, createdDate, updatedDate, airportName, code, location,
              airlineName, airlineCode, contactEmail);
        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalArgumentException("Flight number must not be empty");
        }
        if (departure == null || departure.isEmpty()) {
            throw new IllegalArgumentException("Departure must not be empty");
        }
        if (destination == null || destination.isEmpty()) {
            throw new IllegalArgumentException("Destination must not be empty");
        }
        if (baseFare <= 0) {
            throw new IllegalArgumentException("Base fare must be greater than 0");
        }
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }
    
    public void setFlightNumber(String flightNumber) {
        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalArgumentException("Flight number must not be empty");
        }
        this.flightNumber = flightNumber;
    }
    
    public String getDeparture() {
        return departure;
    }
    
    public void setDeparture(String departure) {
        if (departure == null || departure.isEmpty()) {
            throw new IllegalArgumentException("Departure must not be empty");
        }
        this.departure = departure;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        if (destination == null || destination.isEmpty()) {
            throw new IllegalArgumentException("Destination must not be empty");
        }
        this.destination = destination;
    }
    
    public double getBaseFare() {
        return baseFare;
    }
    
    public void setBaseFare(double baseFare) {
        if (baseFare <= 0) {
            throw new IllegalArgumentException("Base fare must be greater than 0");
        }
        this.baseFare = baseFare;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Departure: " + departure);
        System.out.println("Destination: " + destination);
        System.out.println("Base Fare: " + baseFare);
    }
}

