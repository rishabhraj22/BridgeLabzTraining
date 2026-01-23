package com.collections.votingsystem;
import java.util.*;

public class VotingMain {
    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of votes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Vote for: ");
            system.vote(sc.nextLine());
        }

        system.displayInsertionOrder();
        system.displayResults();
    }
}
