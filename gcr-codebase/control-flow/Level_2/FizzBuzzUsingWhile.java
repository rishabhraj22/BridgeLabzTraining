import java.util.Scanner;
public class FizzBuzzUsingWhile {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int num;

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        // Checking number for positive integer
        if (num > 0) {

            // Declaring counter variable
            int i = 1;

            while (i <= num) {

                // Checking multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");

                // Checking multiples of 3
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");

                // Checking multiples of 5
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                // Printing the number
                } else {
                    System.out.println(i);
                }

                i++;
            }

        } else {

            // Displaying message if number is not a positive integer
            System.out.println("Please enter a positive integer");
        }
    }
}
