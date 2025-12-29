import java.util.Scanner;

public class ParkingLotGateSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring parking capacity
        int totalSlots = 10;

        // Variable to track current occupancy and to control system loop
        int occupiedSlots = 0;
        boolean systemActive = true;

        // Loop to keep system running
        while (systemActive && occupiedSlots <= totalSlots) {

            // Displaying menu options
            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Close System");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            // Handling menu options using switch-case
            switch (choice) {

                case 1:
                    // Parking a vehicle
                    if (occupiedSlots < totalSlots) {
                        occupiedSlots++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("Parking Lot is Full.");
                    }
                    break;

                case 2:
                    // Exiting a vehicle
                    if (occupiedSlots > 0) {
                        occupiedSlots--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking Lot is Empty.");
                    }
                    break;

                case 3:
                    // Showing parking occupancy
                    System.out.println("Occupied Slots: " + occupiedSlots);
                    System.out.println("Available Slots: " + (totalSlots - occupiedSlots));
                    break;

                case 4:
                    // Closing the parking system
                    systemActive = false;
                    System.out.println("Parking system closed.");
                    break;

                default:
                    // Handling invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }

            // Checking if parking lot is full
            if (occupiedSlots == totalSlots) {
                System.out.println("Parking Lot is completely full.");
            }
        }
    }
}
