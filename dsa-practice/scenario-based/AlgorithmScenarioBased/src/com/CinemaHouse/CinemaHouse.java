package com.CinemaHouse;
import java.util.Scanner;

public class CinemaHouse {

    // Bubble Sort by show time (ascending)
    public static void bubbleSort(MovieShow[] shows) {
        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (shows[j].getShowTime() > shows[j + 1].getShowTime()) {
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shows today: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        MovieShow[] shows = new MovieShow[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Show " + (i + 1));

            System.out.print("Movie Name: ");
            String name = sc.nextLine();

            System.out.print("Show Time (HHMM, 24-hour format): ");
            int time = sc.nextInt();
            sc.nextLine();

            shows[i] = new MovieShow(name, time);
        }

        // Sort showtimes
        bubbleSort(shows);

        System.out.println("\n🎥 Today’s Shows (Sorted by Time):");
        for (MovieShow show : shows) {
            show.display();
        }
    }
}
