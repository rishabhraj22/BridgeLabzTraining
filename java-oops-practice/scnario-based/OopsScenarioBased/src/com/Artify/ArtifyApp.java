package com.Artify;
import java.util.Scanner;

public class ArtifyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🎨 Welcome to Artify – Digital Art Marketplace");

        // User Input
        System.out.print("Enter Your Name: ");
        String uname = sc.nextLine();

        System.out.print("Enter Wallet Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        User user = new User(uname, balance);

        // Artwork Setup
        System.out.print("\nEnter number of artworks in store: ");
        int n = sc.nextInt();
        sc.nextLine();

        Artwork[] gallery = new Artwork[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nArtwork " + (i + 1));

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Artist: ");
            String artist = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("License Type (Personal/Commercial): ");
            String licenseType = sc.nextLine();

            System.out.print("Do you want to add preview? (yes/no): ");
            String previewChoice = sc.nextLine();

            String preview = null;
            if (previewChoice.equalsIgnoreCase("yes")) {
                System.out.print("Enter preview description: ");
                preview = sc.nextLine();
            }

            System.out.println("Type: 1. Digital Art  2. Print Art");
            System.out.print("Enter choice: ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                if (preview != null)
                    gallery[i] = new DigitalArt(title, artist, price, licenseType);
                else
                    gallery[i] = new DigitalArt(title, artist, price, licenseType);
            } else {
                if (preview != null)
                    gallery[i] = new PrintArt(title, artist, price, licenseType);
                else
                    gallery[i] = new PrintArt(title, artist, price, licenseType);
            }
        }

        int choice;
        do {
            System.out.println("\n--- Artify Menu ---");
            System.out.println("1. View Gallery");
            System.out.println("2. Purchase Artwork");
            System.out.println("3. License Artwork");
            System.out.println("4. View Wallet");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Art Gallery ---");
                    for (int i = 0; i < gallery.length; i++) {
                        System.out.print((i + 1) + ". ");
                        gallery[i].showArt();
                    }
                    break;

                case 2:
                    System.out.print("Enter Artwork Number to Purchase: ");
                    int pno = sc.nextInt() - 1;
                    gallery[pno].purchase(user);
                    break;

                case 3:
                    System.out.print("Enter Artwork Number to License: ");
                    int lno = sc.nextInt() - 1;
                    gallery[lno].license(user);
                    break;

                case 4:
                    user.showWallet();
                    break;

                case 5:
                    System.out.println("Thank you for using Artify 🎨");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
