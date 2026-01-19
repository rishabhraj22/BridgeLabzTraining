package com.ArtExpo;
import java.util.Scanner;

public class ArtExpo {

    // Insertion Sort by registration time
    public static void insertionSort(Artist[] artists, int count) {

        for (int i = 1; i < count; i++) {
            Artist key = artists[i];
            int j = i - 1;

            // Shift artists registered later to the right
            while (j >= 0 && artists[j].getRegistrationTime() > key.getRegistrationTime()) {
                artists[j + 1] = artists[j];
                j--;
            }

            artists[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of artist registrations today: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Artist[] artists = new Artist[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nRegister Artist " + (i + 1));

            System.out.print("Artist ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Artist Name: ");
            String name = sc.nextLine();

            System.out.print("Registration Time (HHMM): ");
            int time = sc.nextInt();
            sc.nextLine();

            artists[count] = new Artist(id, name, time);
            count++;

            // Maintain sorted order after every insertion
            insertionSort(artists, count);
        }

        System.out.println("\n🖼️ Booth Assignment Order (Sorted by Registration Time):");
        for (int i = 0; i < count; i++) {
            artists[i].display();
        }
    }
}
