package com.collectors;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class OrderRevenueSummary {

    static class Order {
        String customer;
        double amount;

        Order(String customer, double amount) {
            this.customer = customer;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Order> orders = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            String customer = sc.nextLine();
            System.out.print("Enter order amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            orders.add(new Order(customer, amount));
        }

        Map<String, Double> revenueByCustomer =
                orders.stream()
                        .collect(groupingBy(o -> o.customer,
                                summingDouble(o -> o.amount)));

        System.out.println("\nTotal revenue per customer:");
        revenueByCustomer.forEach((cust, total) ->
                System.out.println(cust + " -> " + total));
    }
}
