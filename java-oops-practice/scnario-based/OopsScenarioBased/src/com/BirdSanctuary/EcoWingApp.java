package com.BirdSanctuary;
import java.util.Scanner;

public class EcoWingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SanctuaryManager manager = new SanctuaryManager();

        int choice;

        do {
            System.out.println("\n Welcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display All Flying Birds");
            System.out.println("4. Display All Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Show Developer Info (Reflection)");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bird Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Bird ID: ");
                    String id = sc.nextLine();

                    System.out.println("Select Bird Type:");
                    System.out.println("1. Eagle");
                    System.out.println("2. Duck");
                    System.out.println("3. Penguin");
                    System.out.println("4. Seagull");
                    System.out.println("5. Kiwi");
                    System.out.print("Choice: ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    Bird bird = null;

                    switch (type) {
                        case 1: bird = new Eagle(name, id); break;
                        case 2: bird = new Duck(name, id); break;
                        case 3: bird = new Penguin(name, id); break;
                        case 4: bird = new Seagull(name, id); break;
                        case 5: bird = new Kiwi(name, id); break;
                        default:
                            System.out.println("Invalid type.");
                    }

                    if (bird != null) manager.addBird(bird);
                    break;

                case 2:
                    manager.displayAllBirds();
                    break;

                case 3:
                    manager.displayFlyingBirds();
                    break;

                case 4:
                    manager.displaySwimmingBirds();
                    break;

                case 5:
                    manager.displayBoth();
                    break;

                case 6:
                    System.out.print("Enter Bird ID to delete: ");
                    String did = sc.nextLine();
                    manager.deleteBirdById(did);
                    break;

                case 7:
                    manager.sanctuaryReport();
                    break;

                case 8:
                    manager.showDeveloperInfo();
                    break;

                case 9:
                    System.out.println(" Thank you for supporting EcoWing Sanctuary!");
                    break;

                default:
                    System.out.println(" Invalid choice");
            }

        } while (choice != 9);

        sc.close();
    }
}
