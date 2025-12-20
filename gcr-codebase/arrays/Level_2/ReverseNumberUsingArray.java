import java.util.Scanner;
public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variable to store the number entered by user, a temporary variable to find digit count and to store count of digits
        int number = input.nextInt(); 
        int tempNumber = number; 
        int count = 0;

        // Finding the number of digits in the number
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        // Creating array to store digits of the number
        int[] digits = new int[count];

        tempNumber = number;

        // Storing digits of the number into array
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        // Creating array to store reversed digits
        int[] reversedDigits = new int[count];

        // Reversing the digits array
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Displaying the reversed number
        System.out.println("Reversed number is:");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        input.close();
    }
}
