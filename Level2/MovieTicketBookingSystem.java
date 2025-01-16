import java.util.Scanner;

 class MovieTicket {
      String movieName;
      String seatNumber;
      double price;
      boolean isBooked;
 
     // Constructor
     public MovieTicket(String movieName, String seatNumber, double price) {
         this.movieName = movieName;
         this.seatNumber = seatNumber;
         this.price = price;
         this.isBooked = false;
     }
 
     // Book the ticket
     public void bookTicket() {
         if (isBooked) {
             System.out.println("Seat " + seatNumber + " is already booked.");
         } else {
             isBooked = true;
             System.out.println("Ticket successfully booked for " + movieName + " at seat " + seatNumber + ".");
         }
     }

 
     // Display ticket details
     public void displayTicketDetails() {
         if (isBooked) {
             System.out.println("Movie: " + movieName);
             System.out.println("Seat: " + seatNumber);
             System.out.println("Price: "+ price);
         } else {
             System.out.println("Seat " + seatNumber + " is not booked yet.");
         }
     }
 
     // Check if the seat is booked
     public boolean isSeatBooked() {
         return isBooked;
     }
 }
 
 public class MovieTicketBookingSystem {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Create an array of tickets for a specific movie
         MovieTicket[] tickets = {
             new MovieTicket("God of War", "A1", 150.00),
             new MovieTicket("God of War", "A2", 150.00),
             new MovieTicket("God of War", "A3", 200.00), 
             new MovieTicket("God of War", "A4", 200.00), 
         };
 
         while (true) {
             System.out.println("\n--- Movie Ticket Booking System ---");
             System.out.println("1. View Available Tickets");
             System.out.println("2. Book a Ticket");
             System.out.println("3. View Ticket Details");
             System.out.println("4. Exit");
             System.out.print("Enter your choice: ");
             int choice = scanner.nextInt();
 
             switch (choice) {
                 case 1:
                     System.out.println("\nAvailable Tickets:");
                     for (MovieTicket ticket : tickets) {
                         if (!ticket.isSeatBooked()) {
                             System.out.println("Seat " + ticket.seatNumber + " - $" + ticket.price);
                         }
                     }
                     break;
 
                 case 2: // Book a ticket
                     System.out.print("\nEnter seat number to book: ");
                     String seatToBook = scanner.next();
                     boolean seatFound = false;
 
                     for (MovieTicket ticket : tickets) {
                         if (ticket.seatNumber.equalsIgnoreCase(seatToBook)) {
                             ticket.bookTicket();
                             seatFound = true;
                             break;
                         }
                     }
 
                     if (!seatFound) {
                         System.out.println("Invalid seat number. Please try again.");
                     }
                     break;
 
                 case 3: // View ticket details
                     System.out.print("\nEnter seat number to view details: ");
                     String seatToView = scanner.next();
                     boolean ticketFound = false;
 
                     for (MovieTicket ticket : tickets) {
                         if (ticket.seatNumber.equalsIgnoreCase(seatToView)) {
                             ticket.displayTicketDetails();
                             ticketFound = true;
                             break;
                         }
                     }
 
                     if (!ticketFound) {
                         System.out.println("Invalid seat number. Please try again.");
                     }
                     break;
 
                 case 4: // Exit
                     System.out.println("Thank you for using the Movie Ticket Booking System!");
                     scanner.close();
                     return;
 
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         }
     }
 }