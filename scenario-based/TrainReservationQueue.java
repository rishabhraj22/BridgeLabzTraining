import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring total available seats
        int availableSeats = 10;

        // To control booking system
        boolean bookingActive = true;

        // While loop to allow multiple bookings
        while (bookingActive) {

            // Displaying menu options
            System.out.println("\n--- Train Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Show Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            // Handling menu using switch-case
            switch (choice) {

                case 1:
                    // Booking a ticket
                    if (availableSeats > 0) {
                        availableSeats--;
                        System.out.println("Ticket booked successfully.");
                        System.out.println("Remaining Seats: " + availableSeats);
                    } else {
                        System.out.println("No seats available. Booking stopped.");
                        bookingActive = false;
                    }
                    break;

                case 2:
                    // Displaying available seats
                    System.out.println("Available Seats: " + availableSeats);
                    break;

                case 3:
                    // Exiting booking system
                    bookingActive = false;
                    System.out.println("Exiting Train Reservation System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Stopping booking when seats reach zero
            if (availableSeats == 0) {
                System.out.println("All seats are booked. Reservation closed.");
                break;
            }
        }
    }
}
