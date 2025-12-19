import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking number for positive integer
        if (number > 0) {

            // Finding and printing factors of the number
            for (int i = 1; i < number; i++) {

                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
