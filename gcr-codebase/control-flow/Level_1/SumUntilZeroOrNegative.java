import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Declaring variable to store the total sum and user input
        double total = 0.0; 
        double number;

        Scanner input = new Scanner(System.in);

        // Using infinite while loop
        while (true) {

            number = input.nextDouble();

            // Checking if user entered 0 or a negative number
            if (number <= 0) {
                break;
            }
			
            // Adding entered number to total
            total = total + number;
        }
		
        // Displaying the total sum
        System.out.println("The total sum is " + total);
    }
}
