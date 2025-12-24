import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating factorial
        int result = factorial(number);

        // Printing factorial
        System.out.println("Factorial is: " + result);
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {

        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}
