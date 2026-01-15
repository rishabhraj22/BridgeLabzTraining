package com.ZipZipMart;
import java.util.Scanner;

public class ZipZipMartReport {

    // Merge Sort
    public static void mergeSort(Transaction[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge logic (Stable)
    public static void merge(Transaction[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            // First sort by Date
            int dateCompare = L[i].getDate().compareTo(R[j].getDate());

            if (dateCompare < 0) {
                arr[k] = L[i];
                i++;
            }
            // If dates are same, sort by Amount (ascending)
            else if (dateCompare == 0 && L[i].getAmount() <= R[j].getAmount()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Transaction[] transactions = new Transaction[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Transaction " + (i + 1));

            System.out.print("Transaction ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            transactions[i] = new Transaction(id, date, amount);
        }

        // Sorting using Merge Sort
        mergeSort(transactions, 0, n - 1);

        System.out.println("\n📊 ZipZipMart – Sorted Daily Sales Report:");
        for (Transaction t : transactions) {
            t.display();
        }
    }
}
