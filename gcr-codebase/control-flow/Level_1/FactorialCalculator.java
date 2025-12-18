import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking whether the number is a positive integer
        if (number > 0) {

            // Declaring variable to store factorial and counter variable
            int factorial = 1; 
            int counter = 1;

            // Calculating factorial using while loop
            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }

            // Displaying the factorial
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {

            // Displaying message if number is not a positive integer
            System.out.println("Please enter a positive integer");
        }
    }
}
