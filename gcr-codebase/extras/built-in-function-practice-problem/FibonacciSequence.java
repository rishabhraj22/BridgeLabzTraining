import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        // Printing Fibonacci sequence
        printFibonacci(terms);
    }

    // Method to print Fibonacci sequence
    public static void printFibonacci(int terms) {

        int a = 0, b = 1;

        // Printing Fibonacci numbers
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
