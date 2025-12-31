import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable to store total distance travelled and to control loop
        int totalDistance = 0;
        boolean journeyActive = true;

        // While loop to track bus stops
        while (journeyActive) {

            System.out.print("Enter distance covered at this stop (in km): ");
            int distance = scanner.nextInt();

            // Adding distance to total
            totalDistance = totalDistance + distance;

            // Displaying total distance so far
            System.out.println("Total Distance Travelled: " + totalDistance + " km");

            // Asking if passenger wants to get off
            System.out.print("Do you want to get off at this stop? (yes/no): ");
            scanner.nextLine(); // clearing buffer
            String choice = scanner.nextLine();

            // Checking exit condition
            if (choice.equalsIgnoreCase("yes")) {
                journeyActive = false;
                System.out.println("Passenger got off.");
            }
        }

        // Displaying final distance travelled
        System.out.println("Final Distance Travelled: " + totalDistance + " km");
    }
}
