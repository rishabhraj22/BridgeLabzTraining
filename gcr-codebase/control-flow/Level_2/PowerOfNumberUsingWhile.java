import java.util.Scanner;
public class PowerOfNumberUsingWhile {
    public static void main(String[] args) {

        // Declaring variables to store the number, power and to store the result
        int number;
        int power;
		int result = 1;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        power = input.nextInt();

        int counter = 0;

        // Using while loop to calculate power
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Displaying the result
        System.out.println("The result is " + result);
    }
}
