import java.util.Scanner;
public class FactorialCalculatorUsingForLoop {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking whether the number is a natural number
        if (number > 0) {

            // Declaring variable to store factorial
            int factorial = 1;

            // Calculating factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            // Displaying the factorial
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {

            // Displaying message if number is not a natural number
            System.out.println("Please enter a natural number");
        }
    }
}
