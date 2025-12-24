import java.util.Scanner;

public class GCDLCMCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Calculating GCD and LCM
        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b);

        // Printing results
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    // Method to calculate GCD
    public static int calculateGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Method to calculate LCM
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
}
