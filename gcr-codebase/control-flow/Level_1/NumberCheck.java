import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking whether the number is positive, negative, or zero
        if (number > 0) {

            // Displaying positive
            System.out.println("positive");

        } else if (number < 0) {

            // Displaying negative
            System.out.println("negative");

        } else {

            // Displaying zero
            System.out.println("zero");
        }
    }
}
