import java.util.Scanner;
public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variable to store the number entered by user and maximum size for digits array
        int number = input.nextInt();
        int maxDigit = 10;

        // Defining integer array to store digits of the number
        int[] digits = new int[maxDigit];
        int index = 0;

        // Looping until number becomes zero or array limit is reached
        while (number != 0) {

            if (index == maxDigit) {
                break;
            }

            // Extracting last digit of the number
            int digit = number % 10;

            // Storing digit in array
            digits[index] = digit;
            index++;

            // Removing last digit from number
            number = number / 10;
        }

        // Declaring variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Looping to find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {

                // Updating second largest before updating largest
                secondLargest = largest;
                largest = digits[i];

            } else if (digits[i] > secondLargest && digits[i] != largest) {

                // Updating second largest
                secondLargest = digits[i];
            }
        }

        // Displaying the largest digit
        System.out.println("Largest digit is " + largest);

        // Displaying the second largest digit
        System.out.println("Second largest digit is " + secondLargest);

        input.close();
    }
}
