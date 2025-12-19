import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {

        // Declaring variables to store the number and power
        int number;
        int power;
		
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        power = input.nextInt();

        // Checking whether the number and power are positive integers
        if (number > 0 && power >= 0) {

            // Declaring variable to store the result
            int result = 1;

            // Using for loop to calculate power
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Displaying the result
            System.out.println("The result is " + result);

        } else {
            System.out.println("Please enter positive integers");
        }
    }
}
