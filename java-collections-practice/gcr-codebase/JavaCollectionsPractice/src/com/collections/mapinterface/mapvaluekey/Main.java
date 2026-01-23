package com.collections.mapinterface.mapvaluekey;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();

            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();

            map.put(key, value);
        }

        String result = MaxValueKeyFinder.findKeyWithMaxValue(map);

        System.out.println("Key with highest value: " + result);
    }
}
