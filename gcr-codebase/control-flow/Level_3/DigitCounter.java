import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Declaring variable to count digits and initializing to 0
        int count = 0;

        // Using while loop until number becomes 0
        while (number != 0) {
            number = number / 10;
            count++;
        }

        // Displaying the number of digits
        System.out.println("Number of digits = " + count);

    }
}
