import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking the number for natural number
        if (number > 0) {

            // Calculating the sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Displaying the sum
            System.out.println("The sum of " + number + " natural numbers is " + sum);

        } else {
            // Displaying message if number isn't a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
