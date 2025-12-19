import java.util.Scanner;
public class MultiplesBelowHundred {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking whether the number is positive and less than 100
        if (number > 0 && number < 100) {

            // Using for loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {

                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive number less than 100");
        }
    }
}
