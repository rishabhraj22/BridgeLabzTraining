import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        sc.close();

        // Declaring variables to store sum of cubes of digits and Copy of the input number for final comparison
        int sum = 0; 
        int originalNumber = number;

        // Processing each digit using while loop
        while (originalNumber != 0) {

            // Extracting last digit using modulus
            int digit = originalNumber % 10;

            // Adding cube of this digit to sum
            sum = sum + digit * digit * digit;

            // Removing last digit by integer division by 10
            originalNumber = originalNumber / 10;
        }

        // Comparing calculated sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}
