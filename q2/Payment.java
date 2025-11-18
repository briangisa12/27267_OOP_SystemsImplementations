package q2;

import java.time.LocalDateTime;

public class Payment extends Booking {
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private double amountPaid;
    
    public Payment(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   LocalDateTime bookingDate, String seatNumber, String travelClass,
                   LocalDateTime paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare,
              pilotName, licenseNumber, experienceYears,
              crewName, role, shift,
              passengerName, age, gender, contact,
              bookingDate, seatNumber, travelClass);
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw new IllegalArgumentException("Payment method must not be empty");
        }
        if (amountPaid <= 0) {
            throw new IllegalArgumentException("Amount paid must be greater than 0");
        }
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }
    
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }
    
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw new IllegalArgumentException("Payment method must not be empty");
        }
        this.paymentMethod = paymentMethod;
    }
    
    public double getAmountPaid() {
        return amountPaid;
    }
    
    public void setAmountPaid(double amountPaid) {
        if (amountPaid <= 0) {
            throw new IllegalArgumentException("Amount paid must be greater than 0");
        }
        this.amountPaid = amountPaid;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payment Date: " + paymentDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Amount Paid: " + amountPaid);
    }
}

