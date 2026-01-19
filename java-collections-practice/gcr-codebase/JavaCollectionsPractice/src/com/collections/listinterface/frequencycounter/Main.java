package com.collections.listinterface.frequencycounter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<String> list = new ArrayList<>();

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Map<String, Integer> result = FrequencyCounter.countFrequency(list);

        System.out.println("Frequency Map: " + result);
    }
}
