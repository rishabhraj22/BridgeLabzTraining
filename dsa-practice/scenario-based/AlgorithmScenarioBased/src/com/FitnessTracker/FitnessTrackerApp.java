package com.FitnessTracker;
import java.util.Scanner;

public class FitnessTrackerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🏃 Welcome to FitnessTracker – Daily Step Ranking");

        System.out.print("Enter number of users (max 20): ");
        int n = sc.nextInt();
        sc.nextLine();

        User[] users = new User[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nUser " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Steps: ");
            int steps = sc.nextInt();
            sc.nextLine();

            users[i] = new User(id, name, steps);
        }

        int choice;
        do {
            System.out.println("\n--- FitnessTracker Menu ---");
            System.out.println("1. Show Leaderboard");
            System.out.println("2. Update User Steps");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    BubbleSort.sort(users);
                    System.out.println("\n🏆 Leaderboard (High → Low)");
                    for (User u : users) {
                        u.show();
                    }
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();

                    boolean found = false;
                    for (User u : users) {
                        if (u != null && uid == uid) {
                            System.out.print("Enter new steps: ");
                            int newSteps = sc.nextInt();
                            u.setSteps(newSteps);
                            found = true;
                            System.out.println("Steps updated. Leaderboard refreshed!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ User not found");
                    }
                    break;

                case 3:
                    System.out.println("👋 Stay fit! See you tomorrow!");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
