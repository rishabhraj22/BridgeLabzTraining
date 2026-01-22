package com.collections.setinterface.subsetchecker;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Subset (Set1)
        System.out.print("Enter number of elements in Set1: ");
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();

        System.out.println("Enter elements of Set1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Superset (Set2)
        System.out.print("Enter number of elements in Set2: ");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements of Set2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        boolean result = SubsetChecker.isSubset(set1, set2);

        System.out.println("Is Set1 a subset of Set2? " + result);
    }
}
