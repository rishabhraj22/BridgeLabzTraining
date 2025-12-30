import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable to control booking loop
        boolean bookingOpen = true;

        // Loop to allow multiple customers
        while (bookingOpen) {

            // Displaying movie menu
            System.out.println("\n--- Movie Booking Menu ---");
            System.out.println("1. Action Movie");
            System.out.println("2. Comedy Movie");
            System.out.println("3. Drama Movie");
            System.out.println("4. Exit");
            System.out.print("Choose movie type: ");

            int movieChoice = scanner.nextInt();

            // Exit condition
            if (movieChoice == 4) {
                System.out.println("Booking closed. Thank you!");
                break;
            }

            // Variable to store base ticket price
            double ticketPrice = 0;

            // Selecting ticket price using switch
            switch (movieChoice) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 180;
                    break;
                case 3:
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie choice.");
                    continue;
            }

            // Asking seat type
            System.out.print("Enter seat type (Gold/Silver): ");
            scanner.nextLine();
            String seatType = scanner.nextLine();

            // Adding cost based on seat type
            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice = ticketPrice + 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice = ticketPrice + 50;
            } else {
                System.out.println("Invalid seat type.");
                continue;
            }

            // Asking for snacks
            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = scanner.nextLine();

            // Adding snacks cost
            if (snacksChoice.equalsIgnoreCase("yes")) {
                ticketPrice = ticketPrice + 80;
            }

            // Displaying final ticket price
            System.out.println("Total Ticket Price: ₹" + ticketPrice);
        }
    }
}
