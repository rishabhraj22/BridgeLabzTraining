package com.ParcelTracker;
import java.util.Scanner;

public class ParcelTrackerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelRoute route = new ParcelRoute();

        int choice;

        do {
            System.out.println("\n---- Parcel Tracker Menu ----");
            System.out.println("1. Add Stage");
            System.out.println("2. Add Checkpoint After Stage");
            System.out.println("3. Track Parcel");
            System.out.println("4. Mark Parcel Lost After Stage");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Stage Name: ");
                    String stage = sc.nextLine();
                    route.addStage(stage);
                    break;

                case 2:
                    System.out.print("Enter Existing Stage Name: ");
                    String existing = sc.nextLine();

                    System.out.print("Enter New Checkpoint Stage Name: ");
                    String newStage = sc.nextLine();

                    route.addCheckpointAfter(existing, newStage);
                    break;

                case 3:
                    route.trackParcel();
                    break;

                case 4:
                    System.out.print("Enter Stage Name after which parcel is lost: ");
                    String lostStage = sc.nextLine();
                    route.markParcelLostAfter(lostStage);
                    break;

                case 5:
                    System.out.println("Exiting Parcel Tracker System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
