package com.collections.setinterface.settosortedlist;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in set: ");
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        List<Integer> sortedList =
                SetToSortedListConverter.convertAndSort(set);

        System.out.println("Sorted List: " + sortedList);
    }
}
