import java.util.Scanner;
public class DigitFrequencyCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Declaring a temporary variable to find digit count and store count of digits
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

        // Creating frequency array of size 10
        int[] frequency = new int[10];

        // Calculating frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Displaying the frequency of each digit
        System.out.println("Digit Frequency:");
		
        for (int i = 0; i < frequency.length; i++) {
            // Displaying digit and its frequency
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();
    }
}
