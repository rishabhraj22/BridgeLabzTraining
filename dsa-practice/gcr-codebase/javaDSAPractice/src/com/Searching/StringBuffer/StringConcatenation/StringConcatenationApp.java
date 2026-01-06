package com.Searching.StringBuffer.StringConcatenation;
import java.util.Scanner;

public class StringConcatenationApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        StringConcatenationService service = new StringConcatenationService();
        String result = service.concatenateStrings(arr);

        System.out.println("Concatenated String: " + result);

        sc.close();
    }
}
