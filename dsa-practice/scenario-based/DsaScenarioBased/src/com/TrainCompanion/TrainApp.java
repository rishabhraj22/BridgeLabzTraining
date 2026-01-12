package com.TrainCompanion;
import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainRoute route = new TrainRoute();

        int choice;

        do {
            System.out.println("\n---- Train Compartment Navigation System ----");
            System.out.println("1. Add Compartment");
            System.out.println("2. Remove Compartment");
            System.out.println("3. Traverse Forward");
            System.out.println("4. Traverse Backward");
            System.out.println("5. Show Adjacent Compartments");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Compartment Name: ");
                    String name = sc.nextLine();
                    route.addCompartment(name);
                    break;

                case 2:
                    System.out.print("Enter Compartment Name to Remove: ");
                    String removeName = sc.nextLine();
                    route.removeCompartment(removeName);
                    break;

                case 3:
                    route.traverseForward();
                    break;

                case 4:
                    route.traverseBackward();
                    break;

                case 5:
                    System.out.print("Enter Compartment Name: ");
                    String searchName = sc.nextLine();
                    route.showAdjacent(searchName);
                    break;

                case 6:
                    System.out.println("Exiting Train Navigation System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
