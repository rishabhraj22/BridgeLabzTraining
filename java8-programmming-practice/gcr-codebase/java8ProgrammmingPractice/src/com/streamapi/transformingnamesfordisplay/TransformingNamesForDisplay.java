package com.streamapi.transformingnamesfordisplay;
import java.util.*;
import java.util.stream.*;

class TransformingNamesForDisplay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            names.add(sc.nextLine());
        }

        System.out.println("\nNames in uppercase and sorted:");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
