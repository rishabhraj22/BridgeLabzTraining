import java.util.Scanner;

public class SumOfNaturalNumbersComparison {

    // Method to find sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Checking if number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {

            // Calculating sum using recursion
            int recursiveSum = sumUsingRecursion(n);

            // Calculating sum using formula
            int formulaSum = sumUsingFormula(n);

            // Displaying sum
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            // Comparing sum
            if (recursiveSum == formulaSum) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }
        }

        sc.close();
    }
}
