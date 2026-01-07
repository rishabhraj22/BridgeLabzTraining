package com.ParkEase;
import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookingLog bookingLog = new BookingLog();

        System.out.println("🅿️ Welcome to ParkEase – Smart Parking System");

        // Slot Setup
        System.out.print("Enter number of parking slots: ");
        int n = sc.nextInt();
        sc.nextLine();

        ParkingSlot[] slots = new ParkingSlot[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSlot " + (i + 1));
            System.out.print("Enter Slot ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Allowed Vehicle Type (Car/Bike/Truck): ");
            String type = sc.nextLine();

            slots[i] = new ParkingSlot(id, type);
        }

        int choice;
        do {
            System.out.println("\n--- ParkEase Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Release Slot");
            System.out.println("3. View Slot Status");
            System.out.println("4. View Booking Logs");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Select Vehicle Type:");
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.println("3. Truck");
                    System.out.print("Choice: ");
                    int vchoice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Vehicle Number: ");
                    String vno = sc.nextLine();

                    Vehicle vehicle;
                    if (vchoice == 1) vehicle = new Car(vno);
                    else if (vchoice == 2) vehicle = new Bike(vno);
                    else vehicle = new Truck(vno);

                    boolean parked = false;

                    for (ParkingSlot slot : slots) {
                        if (slot.isAvailable() &&
                            slot.getVehicleTypeAllowed().equalsIgnoreCase(vehicle.getType())) {
                            slot.occupy();
                            bookingLog.addLog("Vehicle " + vno + " parked in Slot " + slot.getSlotId());
                            System.out.println("✅ Vehicle parked in Slot " + slot.getSlotId());
                            parked = true;
                            break;
                        }
                    }

                    if (!parked) {
                        System.out.println("❌ No available slot for " + vehicle.getType());
                    }
                    break;

                case 2:
                    System.out.print("Enter Slot ID to release: ");
                    int rid = sc.nextInt();

                    System.out.print("Enter Parking Duration (hours): ");
                    int hours = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (ParkingSlot slot : slots) {
                        if (slot.getSlotId() == rid && !slot.isAvailable()) {
                            System.out.print("Enter Vehicle Type (Car/Bike/Truck): ");
                            String rtype = sc.nextLine();

                            Vehicle v;
                            if (rtype.equalsIgnoreCase("Car")) v = new Car("TEMP");
                            else if (rtype.equalsIgnoreCase("Bike")) v = new Bike("TEMP");
                            else v = new Truck("TEMP");

                            double charges = v.calculateCharges(hours);
                            slot.release();
                            bookingLog.addLog("Slot " + rid + " released. Charges: ₹" + charges);
                            System.out.println("✅ Slot released. Parking Charges: ₹" + charges);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ Slot not found or already free");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Slot Status ---");
                    for (ParkingSlot slot : slots) {
                        System.out.println("Slot " + slot.getSlotId() +
                                " | Allowed: " + slot.getVehicleTypeAllowed() +
                                " | Available: " + slot.isAvailable());
                    }
                    break;

                case 4:
                    bookingLog.showLogs();
                    break;

                case 5:
                    System.out.println("Thank you for using ParkEase 🚗");
                    break;

                default:
                    System.out.println("❌ Invalid option");
            }

        } while (choice != 5);

        sc.close();
    }
}
