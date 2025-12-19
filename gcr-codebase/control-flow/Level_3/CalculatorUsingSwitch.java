import java.util.Scanner;
public class CalculatorUsingSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variables to store two numbers and store operator
        double first;
        double second; 
        String op;
		
        first = input.nextDouble();
        second = input.nextDouble();
        op = input.next();

        // Using switch-case to perform operation based on operator
        switch (op) {

            // Addition case
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            // Subtraction case
            case "-":
                System.out.println("Result = " + (first - second));
                break;

            // Multiplication case
            case "*":
                System.out.println("Result = " + (first * second));
                break;

            // Division case
            case "/":
                System.out.println("Result = " + (first / second));
                break;

            // Default case for invalid operator
            default:
                System.out.println("Invalid Operator");
        }
    }
}
