package com.GamerZone;
import java.util.Scanner;

public class GamerZone {

    // Quick Sort by score (descending for leaderboard)
    public static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    // Partition logic
    public static int partition(Player[] players, int low, int high) {
        int pivot = players[high].getScore();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players[j].getScore() > pivot) { // higher score first
                i++;
                Player temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }

        Player temp = players[i + 1];
        players[i + 1] = players[high];
        players[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Player " + (i + 1));

            System.out.print("Player Name: ");
            String name = sc.nextLine();

            System.out.print("Score: ");
            int score = sc.nextInt();
            sc.nextLine();

            players[i] = new Player(name, score);
        }

        // Sort leaderboard
        quickSort(players, 0, n - 1);

        System.out.println("\n🏆 GamerZone Leaderboard:");
        for (int i = 0; i < players.length; i++) {
            System.out.print("Rank " + (i + 1) + " → ");
            players[i].display();
        }
    }
}
