package com.HomeNest;
import java.util.Scanner;

public class HomeNestApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🏠 Welcome to HomeNest – Smart Home Manager");

        System.out.print("Enter number of devices to register: ");
        int n = sc.nextInt();
        sc.nextLine();

        Device[] devices = new Device[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nRegister Device " + (i + 1));
            System.out.print("Enter Device ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Select Device Type:");
            System.out.println("1. Light");
            System.out.println("2. Camera");
            System.out.println("3. Thermostat");
            System.out.println("4. Lock");
            System.out.print("Enter choice: ");
            int type = sc.nextInt();

            switch (type) {
                case 1:
                    devices[i] = new Light(id);
                    break;
                case 2:
                    devices[i] = new Camera(id);
                    break;
                case 3:
                    devices[i] = new Thermostat(id);
                    break;
                case 4:
                    devices[i] = new Lock(id);
                    break;
                default:
                    System.out.println("❌ Invalid type, defaulting to Light");
                    devices[i] = new Light(id);
            }
        }

        int choice;
        do {
            System.out.println("\n--- HomeNest Menu ---");
            System.out.println("1. Turn ON Device");
            System.out.println("2. Turn OFF Device");
            System.out.println("3. Reset Device");
            System.out.println("4. View Device Status");
            System.out.println("5. View Firmware Log");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Device ID: ");
                    int onId = sc.nextInt();
                    for (Device d : devices) {
                        if (d.deviceId == onId) {
                            d.turnOn();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter Device ID: ");
                    int offId = sc.nextInt();
                    for (Device d : devices) {
                        if (d.deviceId == offId) {
                            d.turnOff();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Device ID: ");
                    int rId = sc.nextInt();
                    for (Device d : devices) {
                        if (d.deviceId == rId) {
                            d.reset();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Device Status ---");
                    for (Device d : devices) {
                        d.showStatus();
                    }
                    break;

                case 5:
                    System.out.print("Enter Device ID: ");
                    int fId = sc.nextInt();
                    for (Device d : devices) {
                        if (d.deviceId == fId) {
                            d.showFirmwareLog();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using HomeNest 🏠");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
