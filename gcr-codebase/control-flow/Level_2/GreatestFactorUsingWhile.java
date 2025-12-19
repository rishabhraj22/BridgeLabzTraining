import java.util.Scanner;
public class GreatestFactorUsingWhile {
    public static void main(String[] args) {

        // Declaring variable to store the number and to store the greatest factor
        int number; 
        int greatestFactor = 1;
		
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int counter = number - 1;

        // Using while loop to find the greatest factor
        while (counter >= 1) {

            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
		
        // Displaying the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
    }
}
