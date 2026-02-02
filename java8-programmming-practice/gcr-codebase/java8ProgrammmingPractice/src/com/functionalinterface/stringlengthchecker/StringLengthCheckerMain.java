package com.functionalinterface.stringlengthchecker;
import java.util.Scanner;
import java.util.function.Function;

public class StringLengthCheckerMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = sc.nextLine();

        System.out.print("Enter character limit: ");
        int limit = sc.nextInt();

        Function<String, Integer> lengthCalculator =
                text -> text.length();

        int messageLength = lengthCalculator.apply(message);

        if (messageLength > limit) {
            System.out.println("❌ Message exceeds the character limit.");
        } else {
            System.out.println("✅ Message is within the character limit.");
        }

        System.out.println("Message Length: " + messageLength);

        sc.close();
    }
}
