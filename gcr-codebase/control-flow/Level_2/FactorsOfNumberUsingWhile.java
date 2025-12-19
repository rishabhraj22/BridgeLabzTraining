import java.util.Scanner;
public class FactorsOfNumberUsingWhile {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking whether the number is a positive integer
        if (number > 0) {

            int counter = 1;

            // Using while loop to find factors
            while (counter < number) {

                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }

        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
