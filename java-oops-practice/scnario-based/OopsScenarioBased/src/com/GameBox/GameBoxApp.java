package com.GameBox;
import java.util.Scanner;

public class GameBoxApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🎮 Welcome to GameBox – Mobile Game Store");

        // User Input
        System.out.print("Enter Your Name: ");
        String uname = sc.nextLine();

        System.out.print("Enter Wallet Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        User user = new User(uname, balance);

        // Game Store Setup
        System.out.print("\nEnter number of games in store: ");
        int n = sc.nextInt();
        sc.nextLine();

        Game[] store = new Game[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nGame " + (i + 1));

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Price (0 for free): ");
            double price = sc.nextDouble();

            System.out.print("Rating (out of 5): ");
            double rating = sc.nextDouble();
            sc.nextLine();

            System.out.println("Type: 1. Arcade  2. Strategy");
            System.out.print("Enter choice: ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                store[i] = new ArcadeGame(title, price, rating);
            } else {
                store[i] = new StrategyGame(title, price, rating);
            }
        }

        int choice;
        do {
            System.out.println("\n--- GameBox Menu ---");
            System.out.println("1. View Games");
            System.out.println("2. Play Demo");
            System.out.println("3. Apply Seasonal Offer");
            System.out.println("4. Download Game");
            System.out.println("5. View Owned Games");
            System.out.println("6. View Wallet");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Available Games ---");
                    for (int i = 0; i < store.length; i++) {
                        System.out.print((i + 1) + ". ");
                        store[i].showGame();
                    }
                    break;

                case 2:
                    System.out.print("Enter Game Number for Demo: ");
                    int dno = sc.nextInt() - 1;
                    store[dno].playDemo();
                    break;

                case 3:
                    System.out.print("Enter Discount Percentage: ");
                    double percent = sc.nextDouble();

                    for (Game g : store) {
                        g.applySeasonalOffer(percent);
                    }
                    System.out.println("Seasonal offer applied to all games!");
                    break;

                case 4:
                    System.out.print("Enter Game Number to Download: ");
                    int gno = sc.nextInt() - 1;
                    store[gno].download(user);
                    break;

                case 5:
                    user.showOwnedGames();
                    break;

                case 6:
                    user.showWallet();
                    break;

                case 7:
                    System.out.println("Thank you for using GameBox 🎮");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}
