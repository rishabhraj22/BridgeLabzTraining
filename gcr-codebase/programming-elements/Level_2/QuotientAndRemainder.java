import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Declaring variables to store two numbers
        int number1;
        int number2;

        number1 = input.nextInt();
        number2 = input.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Displaying the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
    }
}
