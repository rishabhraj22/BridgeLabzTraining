import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Checking whether the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");

            // Exiting the program
            input.close();
            return;
        }

        // Creating String array to store FizzBuzz results
        String[] results = new String[number + 1];

        // Looping to generate FizzBuzz values
        for (int i = 1; i <= number; i++) {

            // Checking for multiples of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";

            // Checking for multiples of 3
            } else if (i % 3 == 0) {
                results[i] = "Fizz";

            // Checking for multiples of 5
            } else if (i % 5 == 0) {
                results[i] = "Buzz";

            } else {

                // Storing the number as String
                results[i] = String.valueOf(i);
            }
        }

        // Displaying the results with position
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        input.close();
    }
}
