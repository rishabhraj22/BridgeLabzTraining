import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {

        // Declaring variable to store the total sum and user input
        double total = 0.0; 
        double number;

        Scanner input = new Scanner(System.in);
        number = input.nextDouble();

        // Using while loop until user enters 0
        while (number != 0) {

            // Adding entered number to total
            total = total + number;

            // Taking input again
            number = input.nextDouble();
        }

        // Displaying the total sum
        System.out.println("The total sum is " + total);
    }
}
