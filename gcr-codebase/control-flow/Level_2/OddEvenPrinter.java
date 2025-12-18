import java.util.Scanner;
public class OddEvenPrinter {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking whether the number is a natural number
        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                // Checking if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }

        } else {

            // Displaying message if number is not a natural number
            System.out.println("Please enter a natural number");
        }
    }
}
