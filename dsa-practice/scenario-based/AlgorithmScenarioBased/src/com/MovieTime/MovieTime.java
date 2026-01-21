package com.MovieTime;
import java.util.Scanner;

public class MovieTime {

    // Insertion Sort by show time
    public static void insertionSort(Show[] shows, int count) {

        for (int i = 1; i < count; i++) {
            Show key = shows[i];
            int j = i - 1;

            // Shift shows that start later
            while (j >= 0 && shows[j].getShowTime() > key.getShowTime()) {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shows to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Show[] shows = new Show[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nAdd Show " + (i + 1));

            System.out.print("Movie Name: ");
            String name = sc.nextLine();

            System.out.print("Show Time (HHMM): ");
            int time = sc.nextInt();
            sc.nextLine();

            shows[count] = new Show(name, time);
            count++;

            // Maintain sorted order after each insertion
            insertionSort(shows, count);
        }

        System.out.println("\n🎬 Upcoming Shows (Sorted by Time):");
        for (int i = 0; i < count; i++) {
            shows[i].display();
        }
    }
}
