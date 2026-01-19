package com.collections.setinterface.setequality;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First set
        System.out.print("Enter number of elements in Set1: ");
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();

        System.out.println("Enter elements of Set1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Second set
        System.out.print("Enter number of elements in Set2: ");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements of Set2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        boolean result = SetEqualityChecker.areSetsEqual(set1, set2);

        System.out.println("Are both sets equal? " + result);
    }
}
