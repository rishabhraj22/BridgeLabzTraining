package com.Searching.StringBuilder.ReverseString;
import java.util.Scanner;

public class ReverseStringApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        ReverseStringService service = new ReverseStringService();
        String result = service.reverseString(input);

        System.out.println("Reversed String: " + result);

        sc.close();
    }
}
