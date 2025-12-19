import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {

        // Declaring variable to store the number and to store the greatest factor
        int number; 
        int greatestFactor = 1;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Finding the greatest factor other than the number itself
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
    }
}
