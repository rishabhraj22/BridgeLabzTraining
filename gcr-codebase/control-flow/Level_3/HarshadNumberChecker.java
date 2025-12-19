import java.util.Scanner;
public class HarshadNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variable to store the number entered by user and to store original number
        int number = input.nextInt(); 
        int originalNumber = number;

        // Declaring variable to store sum of digits and initializing to 0
        int sum = 0;

        // Using while loop to extract each digit
        while (number != 0) {

            // Extracting last digit
            int digit = number % 10;

            // Adding digit to sum
            sum = sum + digit;

            // Removing last digit
            number = number / 10;
        }

        // Checking if original number is divisible by sum of its digits
        if (originalNumber % sum == 0) {

            // Printing Harshad Number message
            System.out.println(originalNumber + " is a Harshad Number");

        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
    }
}
