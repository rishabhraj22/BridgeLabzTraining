package com.streamapi.loggingtransactions;
import java.time.LocalDateTime;
import java.util.*;

class LoggingTransactions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        List<String> transactionIds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction ID " + (i + 1) + ": ");
            transactionIds.add(sc.next());
        }

        System.out.println("\nTransaction Logs:");

        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
