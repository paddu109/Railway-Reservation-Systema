import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial values
        int totalSeats = 50;
        int availableSeats = totalSeats;

        String passengerName = "";
        int trainNumber = 0;
        boolean ticketBooked = false;

        int choice;

        // Menu runs again and again
        while (true) {

            System.out.println("\n===== Railway Reservation System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Check Available Seats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Book Ticket
                    if (!ticketBooked && availableSeats > 0) {
                        System.out.print("Enter Passenger Name: ");
                        passengerName = sc.next();

                        System.out.print("Enter Train Number: ");
                        trainNumber = sc.nextInt();

                        availableSeats--;
                        ticketBooked = true;

                        System.out.println("✅ Ticket Booked Successfully!");
                    } else if (ticketBooked) {
                        System.out.println("❌ Ticket already booked.");
                    } else {
                        System.out.println("❌ No seats available.");
                    }
                    break;

                case 2:
                    // View Ticket
                    if (ticketBooked) {
                        System.out.println("----- Ticket Details -----");
                        System.out.println("Passenger Name : " + passengerName);
                        System.out.println("Train Number   : " + trainNumber);
                        System.out.println("Ticket Status  : Confirmed");
                    } else {
                        System.out.println("❌ No ticket booked yet.");
                    }
                    break;

                case 3:
                    // Cancel Ticket
                    if (ticketBooked) {
                        ticketBooked = false;
                        availableSeats++;
                        System.out.println("✅ Ticket Cancelled Successfully!");
                    } else {
                        System.out.println("❌ No ticket to cancel.");
                    }
                    break;

                case 4:
                    // Check Available Seats
                    System.out.println("Available Seats: " + availableSeats);
                    break;

                case 5:
                    // Exit
                    System.out.println("Thank you for using Railway Reservation System 🚆");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }
}
