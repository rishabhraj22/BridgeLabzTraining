package com.collections.listinterface.reverselist;
import java.util.*;

public class ReverseListDemo {

    // Reverse ArrayList using two-pointer approach
    public static void reverseArrayList(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    // Reverse LinkedList without using reverse()
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arrayList.add(value);
            linkedList.add(value);
        }

        // Reverse both
        reverseArrayList(arrayList);
        LinkedList<Integer> reversedLinkedList = reverseLinkedList(linkedList);

        // Output
        System.out.println("Reversed ArrayList  : " + arrayList);
        System.out.println("Reversed LinkedList : " + reversedLinkedList);
    }
}
