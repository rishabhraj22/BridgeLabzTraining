package com.BagnBallOrganizer;
import java.util.ArrayList;
import java.util.Scanner;

public class BagNBallApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Bag> bags = new ArrayList<>();

        int choice;

        System.out.println("🎒⚽ Welcome to TinyTown Bag-n-Ball Organizer");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. Display Balls in a Bag");
            System.out.println("5. Display All Bags");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bag ID: ");
                    String bagId = sc.nextLine();

                    System.out.print("Enter Bag Color: ");
                    String bagColor = sc.nextLine();

                    System.out.print("Enter Bag Capacity: ");
                    int cap = sc.nextInt();
                    sc.nextLine();

                    bags.add(new Bag(bagId, bagColor, cap));
                    System.out.println("✅ Bag added.");
                    break;

                case 2:
                    System.out.print("Enter Bag ID: ");
                    String bid = sc.nextLine();

                    Bag selectedBag = null;
                    for (Bag b : bags) {
                        if (b.getId().equals(bid)) {
                            selectedBag = b;
                            break;
                        }
                    }

                    if (selectedBag == null) {
                        System.out.println("❌ Bag not found.");
                        break;
                    }

                    System.out.print("Enter Ball ID: ");
                    String ballId = sc.nextLine();

                    System.out.print("Enter Ball Color: ");
                    String ballColor = sc.nextLine();

                    System.out.print("Enter Ball Size (small/medium/large): ");
                    String size = sc.nextLine();

                    Ball ball = new Ball(ballId, ballColor, size);

                    if (selectedBag.addBall(ball)) {
                        System.out.println("⚽ Ball added to bag.");
                    } else {
                        System.out.println("❌ Bag is full! Cannot add more balls.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Bag ID: ");
                    String rbid = sc.nextLine();

                    Bag bagToRemoveFrom = null;
                    for (Bag b : bags) {
                        if (b.getId().equals(rbid)) {
                            bagToRemoveFrom = b;
                            break;
                        }
                    }

                    if (bagToRemoveFrom == null) {
                        System.out.println("❌ Bag not found.");
                        break;
                    }

                    System.out.print("Enter Ball ID to remove: ");
                    String rid = sc.nextLine();

                    if (bagToRemoveFrom.removeBall(rid)) {
                        System.out.println("🗑 Ball removed.");
                    } else {
                        System.out.println("❌ Ball not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Bag ID: ");
                    String dbid = sc.nextLine();

                    for (Bag b : bags) {
                        if (b.getId().equals(dbid)) {
                            b.displayBalls();
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- All Bags ---");
                    for (Bag b : bags) {
                        b.showInfo();
                    }
                    break;

                case 6:
                    System.out.println("👋 Thank you for using Bag-n-Ball Organizer");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
