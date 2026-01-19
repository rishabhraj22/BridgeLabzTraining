package com.collections.listinterface.nthfromend;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        LinkedList<String> list = new LinkedList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Enter N (from end): ");
        int k = sc.nextInt();

        String result = NthFromEndFinder.findNthFromEnd(list, k);

        if (result == null) {
            System.out.println("N is greater than the list size.");
        } else {
            System.out.println("Nth element from end: " + result);
        }
    }
}
