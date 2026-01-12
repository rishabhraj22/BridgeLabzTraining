package com.AmbulanceRoute;
import java.util.Scanner;

public class AmbulanceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalRoute route = new HospitalRoute();

        int choice;

        do {
            System.out.println("\n---- Ambulance Route Management ----");
            System.out.println("1. Add Hospital Unit");
            System.out.println("2. Display All Units");
            System.out.println("3. Find Nearest Available Unit");
            System.out.println("4. Remove Unit (Maintenance)");
            System.out.println("5. Update Unit Availability");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Unit Name: ");
                    String name = sc.nextLine();

                    System.out.print("Is unit available? (true/false): ");
                    boolean available = sc.nextBoolean();

                    route.addUnit(name, available);
                    break;

                case 2:
                    route.displayUnits();
                    break;

                case 3:
                    route.findNearestAvailableUnit();
                    break;

                case 4:
                    System.out.print("Enter unit name to remove: ");
                    String removeName = sc.nextLine();
                    route.removeUnit(removeName);
                    break;

                case 5:
                    System.out.print("Enter unit name: ");
                    String updateName = sc.nextLine();

                    System.out.print("Set availability (true/false): ");
                    boolean status = sc.nextBoolean();

                    route.updateAvailability(updateName, status);
                    break;

                case 6:
                    System.out.println("Exiting Ambulance Route System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
