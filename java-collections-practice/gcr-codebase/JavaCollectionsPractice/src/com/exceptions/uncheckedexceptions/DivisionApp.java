package com.exceptions.uncheckedexceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only");

        } finally {
            sc.close();
        }
    }

    // Method that may throw unchecked exception
    private static int divide(int a, int b) {
        return a / b; // ArithmeticException handled in main
    }
}
