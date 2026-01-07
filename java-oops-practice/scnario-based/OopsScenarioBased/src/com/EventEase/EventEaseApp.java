package com.EventEase;
import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Organizer Input
        System.out.println("🎉 Welcome to EventEase – Event Management Platform");
        System.out.println("Enter Organizer Details");
        System.out.print("User ID: ");
        int uid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String uname = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        User organizer = new User(uid, uname, email);

        // Event Input
        System.out.println("\nSelect Event Type:");
        System.out.println("1. Birthday Event");
        System.out.println("2. Conference Event");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Event ID: ");
        int eventId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Date (dd-mm-yyyy): ");
        String date = sc.nextLine();

        System.out.print("Enter Number of Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Enter Venue Cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Do you want Catering & Decoration Package? (yes/no): ");
        sc.nextLine();
        String packageChoice = sc.nextLine();

        double serviceCost = 0;
        if (packageChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Service Cost: ");
            serviceCost = sc.nextDouble();
        }

        System.out.print("Enter Discount Amount (if any): ");
        double discount = sc.nextDouble();

        Event event;
        if (choice == 1) {
            event = new BirthdayEvent(eventId, eventName, location, date,
                    attendees, venueCost, serviceCost, discount);
        } else {
            event = new ConferenceEvent(eventId, eventName, location, date,
                    attendees, venueCost, serviceCost, discount);
        }

        int action;
        do {
            System.out.println("\n--- Event Menu ---");
            System.out.println("1. Schedule Event");
            System.out.println("2. Reschedule Event");
            System.out.println("3. Cancel Event");
            System.out.println("4. Show Event Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 1:
                    event.schedule();
                    break;

                case 2:
                    System.out.print("Enter New Date: ");
                    String newDate = sc.nextLine();
                    event.reschedule(newDate);
                    break;

                case 3:
                    event.cancel();
                    break;

                case 4:
                    event.printDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using EventEase, " + organizer.getName() + " 🎉");
                    break;

                default:
                    System.out.println("❌ Invalid option");
            }

        } while (action != 5);

        sc.close();
    }
}
