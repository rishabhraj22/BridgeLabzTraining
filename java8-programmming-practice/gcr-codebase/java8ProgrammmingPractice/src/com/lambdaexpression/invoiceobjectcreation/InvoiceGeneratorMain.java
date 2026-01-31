package com.lambdaexpression.invoiceobjectcreation;
import java.util.*;

public class InvoiceGeneratorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> transactions = new ArrayList<>();

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction ID: ");
            transactions.add(sc.nextLine());
        }

        List<Invoice> invoices =
                transactions.stream()
                            .map(Invoice::new)   // constructor reference
                            .toList();

        System.out.println("\nGenerated Invoices:");
        invoices.forEach(System.out::println);

        sc.close();
    }
}
