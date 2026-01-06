package com.Searching.StringBuilder.RemoveDuplicates;
import java.util.Scanner;

public class RemoveDuplicatesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        RemoveDuplicatesService service = new RemoveDuplicatesService();
        String result = service.removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
