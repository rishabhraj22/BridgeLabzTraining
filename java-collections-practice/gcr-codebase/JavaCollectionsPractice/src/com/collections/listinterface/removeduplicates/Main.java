package com.collections.listinterface.removeduplicates;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> uniqueList = DuplicateRemover.removeDuplicates(list);

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
