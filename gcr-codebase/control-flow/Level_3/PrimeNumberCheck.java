import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        
		// Declaring variable to store number and isPrime
        int number;
        boolean isPrime = true;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();
		
        // Checking for prime number
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
		
        // Displaying the result
        System.out.println("Is Prime Number: " + isPrime);
    }
}
