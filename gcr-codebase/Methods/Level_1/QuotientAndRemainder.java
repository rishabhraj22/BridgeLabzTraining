import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Calling the above method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying quotient and remainder
        System.out.println("Quotient is: " + result[0]);
        System.out.println("Remainder is: " + result[1]);

        sc.close();
    }
}
