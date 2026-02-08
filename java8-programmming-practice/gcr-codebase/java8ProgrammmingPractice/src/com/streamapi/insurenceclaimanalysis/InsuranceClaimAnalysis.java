package com.streamapi.insurenceclaimanalysis;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class InsuranceClaimAnalysis {

    static class Claim {
        String type;
        double amount;

        Claim(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of claims: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Claim> claims = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter claim type: ");
            String type = sc.nextLine();
            System.out.print("Enter claim amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            claims.add(new Claim(type, amount));
        }

        Map<String, Double> averageByType =
                claims.stream()
                        .collect(groupingBy(c -> c.type, averagingDouble(c -> c.amount)));

        System.out.println("\nAverage claim amount by type:");
        averageByType.forEach((type, avg) ->
                System.out.println(type + " -> " + avg));
    }
}
