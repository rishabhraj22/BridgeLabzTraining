import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking prime condition
        if (isPrime(number)) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }

    // Method to check prime number
    public static boolean isPrime(int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
