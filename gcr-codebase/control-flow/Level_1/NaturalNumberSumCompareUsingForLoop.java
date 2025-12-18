import java.util.Scanner;
public class NaturalNumberSumCompareUsingForLoop {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking whether the number is a natural number
        if (number > 0) {

            // Calculating sum using formula
            int formulaSum = number * (number + 1) / 2;

            // Calculating sum using for loop
            int loopSum = 0;

            for (int i = 1; i <= number; i++) {
                loopSum = loopSum + i;
            }

            // Comparing both results
            if (formulaSum == loopSum) {

                // Displaying result if both sums are equal
                System.out.println("The sum of " + number + " natural numbers is " + loopSum + " and both results are correct.");

            } else {
                System.out.println("The results are not matching.");
            }

        } else {
            // Displaying message if number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
