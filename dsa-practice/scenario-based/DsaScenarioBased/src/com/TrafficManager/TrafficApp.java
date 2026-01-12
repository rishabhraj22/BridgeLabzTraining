package com.TrafficManager;
import java.util.Scanner;

public class TrafficApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum waiting queue size: ");
        int maxSize = sc.nextInt();
        sc.nextLine();

        TrafficRoundabout traffic = new TrafficRoundabout(maxSize);

        int choice;

        do {
            System.out.println("\n---- Traffic Manager Menu ----");
            System.out.println("1. Add Vehicle to Roundabout");
            System.out.println("2. Remove Vehicle from Roundabout");
            System.out.println("3. Add Vehicle to Waiting Queue");
            System.out.println("4. Move Vehicle from Queue to Roundabout");
            System.out.println("5. Display Roundabout");
            System.out.println("6. Display Waiting Queue");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String v1 = sc.nextLine();
                    traffic.addVehicleToRoundabout(v1);
                    break;

                case 2:
                    System.out.print("Enter Vehicle Number to Remove: ");
                    String v2 = sc.nextLine();
                    traffic.removeVehicleFromRoundabout(v2);
                    break;

                case 3:
                    System.out.print("Enter Vehicle Number: ");
                    String v3 = sc.nextLine();
                    traffic.addVehicleToQueue(v3);
                    break;

                case 4:
                    traffic.moveFromQueueToRoundabout();
                    break;

                case 5:
                    traffic.displayRoundabout();
                    break;

                case 6:
                    traffic.displayQueue();
                    break;

                case 7:
                    System.out.println("Exiting Traffic Manager System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
