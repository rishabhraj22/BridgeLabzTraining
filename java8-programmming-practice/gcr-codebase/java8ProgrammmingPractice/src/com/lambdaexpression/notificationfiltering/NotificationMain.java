package com.lambdaexpression.notificationfiltering;
import java.util.*;
import java.util.function.Predicate;

public class NotificationMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Alert> alerts = List.of(
                new Alert("Heart rate critical", "EMERGENCY"),
                new Alert("Medicine reminder", "REMINDER"),
                new Alert("Doctor appointment", "INFO"),
                new Alert("Blood pressure high", "EMERGENCY")
        );

        System.out.println("Choose alert type to view:");
        System.out.println("1. EMERGENCY");
        System.out.println("2. REMINDER");
        System.out.println("3. INFO");

        int choice = sc.nextInt();

        Predicate<Alert> filter;

        if (choice == 1) {
            filter = a -> a.getType().equalsIgnoreCase("EMERGENCY");
        } else if (choice == 2) {
            filter = a -> a.getType().equalsIgnoreCase("REMINDER");
        } else {
            filter = a -> a.getType().equalsIgnoreCase("INFO");
        }

        System.out.println("\nFiltered Alerts:");
        alerts.stream()
              .filter(filter)
              .forEach(System.out::println);

        sc.close();
    }
}
