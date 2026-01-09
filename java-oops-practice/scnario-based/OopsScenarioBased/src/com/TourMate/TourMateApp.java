package com.TourMate;
import java.util.Scanner;

public class TourMateApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to TourMate – Travel Planner");

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Trip Duration (days): ");
        int duration = sc.nextInt();
        sc.nextLine();

        // Hotel
        System.out.println("\nEnter Hotel Details");
        System.out.print("Hotel Name: ");
        String hname = sc.nextLine();

        System.out.print("Cost per Night: ");
        double costPerNight = sc.nextDouble();

        System.out.print("Number of Nights: ");
        int nights = sc.nextInt();
        sc.nextLine();

        Hotel hotel = new Hotel(hname, costPerNight, nights);

        // Transport
        System.out.println("\nEnter Transport Details");
        System.out.print("Mode (Bus/Train/Flight): ");
        String mode = sc.nextLine();

        System.out.print("Transport Cost: ");
        double tcost = sc.nextDouble();
        sc.nextLine();

        Transport transport = new Transport(mode, tcost);

        // Activity
        System.out.println("\nEnter Activity Details");
        System.out.print("Activity Name: ");
        String aname = sc.nextLine();

        System.out.print("Activity Cost: ");
        double acost = sc.nextDouble();
        sc.nextLine();

        Activity activity = new Activity(aname, acost);

        // Trip Type
        System.out.println("\nSelect Trip Type:");
        System.out.println("1. Domestic Trip");
        System.out.println("2. International Trip");
        System.out.print("Enter choice: ");
        int type = sc.nextInt();

        Trip trip;
        if (type == 1) {
            trip = new DomesticTrip(destination, duration, hotel, transport, activity);
        } else {
            trip = new InternationalTrip(destination, duration, hotel, transport, activity);
        }

        int choice;
        do {
            System.out.println("\n--- TourMate Menu ---");
            System.out.println("1. Book Trip");
            System.out.println("2. Cancel Trip");
            System.out.println("3. View Trip Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    trip.bookTrip();
                    break;

                case 2:
                    trip.cancelTrip();
                    break;

                case 3:
                    trip.showTripDetails();
                    break;

                case 4:
                    System.out.println("Thank you for using TourMate ✈️");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
