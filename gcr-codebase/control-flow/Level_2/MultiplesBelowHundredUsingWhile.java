import java.util.Scanner;
public class MultiplesBelowHundredUsingWhile {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking whether the number is positive and less than 100
        if (number > 0 && number < 100) {

            int counter = 100;

            // Using while loop to find multiples below 100
            while (counter >= 1) {

                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }

        } else {
            System.out.println("Please enter a positive number less than 100");
        }
    }
}
