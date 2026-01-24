package com.exceptions.nestedtrycatchblock;
import java.util.Scanner;

public class NestedTryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] numbers = new int[size];
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            try {
                int result = ArrayDivisionService.getResult(numbers, index, divisor);
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            sc.close();
        }
    }
}
