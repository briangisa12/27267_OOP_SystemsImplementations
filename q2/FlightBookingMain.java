package q2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class FlightBookingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== FLIGHT BOOKING SYSTEM [27267] ==========");
        System.out.println("Enter Flight Booking Details:\n");
        
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            LocalDateTime now = LocalDateTime.now();
            
            System.out.print("Enter Airport Name: ");
            String airportName = scanner.nextLine();
            
            System.out.print("Enter Airport Code (3 uppercase letters): ");
            String code = scanner.nextLine().toUpperCase();
            
            System.out.print("Enter Location: ");
            String location = scanner.nextLine();
            
            System.out.print("Enter Airline Name: ");
            String airlineName = scanner.nextLine();
            
            System.out.print("Enter Airline Code (2-4 letters): ");
            String airlineCode = scanner.nextLine();
            
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();
            
            System.out.print("Enter Flight Number: ");
            String flightNumber = scanner.nextLine();
            
            System.out.print("Enter Departure: ");
            String departure = scanner.nextLine();
            
            System.out.print("Enter Destination: ");
            String destination = scanner.nextLine();
            
            System.out.print("Enter Base Fare: ");
            double baseFare = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Pilot Name: ");
            String pilotName = scanner.nextLine();
            
            System.out.print("Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            
            System.out.print("Enter Experience Years: ");
            int experienceYears = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Crew Name: ");
            String crewName = scanner.nextLine();
            
            System.out.print("Enter Role: ");
            String role = scanner.nextLine();
            
            System.out.print("Enter Shift (Day/Night): ");
            String shift = scanner.nextLine();
            
            System.out.print("Enter Passenger Name: ");
            String passengerName = scanner.nextLine();
            
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            
            System.out.print("Enter Contact: ");
            String contact = scanner.nextLine();
            
            System.out.print("Enter Booking Date (YYYY-MM-DD): ");
            String bookingDateStr = scanner.nextLine();
            LocalDateTime bookingDate = LocalDateTime.parse(bookingDateStr + "T00:00:00");
            
            System.out.print("Enter Seat Number: ");
            String seatNumber = scanner.nextLine();
            
            System.out.print("Enter Travel Class (Economy/Business/First): ");
            String travelClass = scanner.nextLine();
            
            System.out.print("Enter Payment Date (YYYY-MM-DD): ");
            String paymentDateStr = scanner.nextLine();
            LocalDateTime paymentDate = LocalDateTime.parse(paymentDateStr + "T00:00:00");
            
            System.out.print("Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            
            System.out.print("Enter Amount Paid: ");
            double amountPaid = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter Ticket Number: ");
            String ticketNumber = scanner.nextLine();
            
            System.out.print("Enter Issue Date (YYYY-MM-DD): ");
            String issueDateStr = scanner.nextLine();
            LocalDateTime issueDate = LocalDateTime.parse(issueDateStr + "T00:00:00");
            
            Ticket ticket = new Ticket(
                id, now, now,
                airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid,
                ticketNumber, issueDate
            );
            
            System.out.println("\n========== ALL INSERTED DATA [27267] ==========");
            ticket.displayInfo();
            System.out.println("\n");
            System.out.println("========== FARE CALCULATION [27267] ==========");
            double finalFare = ticket.calculateFare();
            System.out.println("Base Fare: " + ticket.getBaseFare());
            System.out.println("Final Fare (with taxes and discounts): " + finalFare);
            System.out.println("==============================================\n");
            
        } catch (Exception e) {
            System.out.println("Error [27267]: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

