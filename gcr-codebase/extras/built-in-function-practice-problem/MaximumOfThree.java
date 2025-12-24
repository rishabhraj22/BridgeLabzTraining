import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking three integer inputs
        int a = getInput(scanner, "Enter first number: ");
        int b = getInput(scanner, "Enter second number: ");
        int c = getInput(scanner, "Enter third number: ");

        // Finding maximum number
        int max = findMaximum(a, b, c);

        // Printing maximum value
        System.out.println("Maximum number is: " + max);
    }

    // Method to take input
    public static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        return max;
    }
}
