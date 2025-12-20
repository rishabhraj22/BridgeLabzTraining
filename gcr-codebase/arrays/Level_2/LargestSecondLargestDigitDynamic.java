import java.util.Scanner;

public class LargestSecondLargestDigitDynamic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variable to store the number entered by user and Initial maximum size for digits array
        int number = input.nextInt(); 
        int maxDigit = 10;

        // Creating digits array with initial size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Looping until number becomes zero
        while (number != 0) {

            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];
				
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            // Extracting last digit of the number
            int digit = number % 10;
            digits[index] = digit;
            index++;

            // Removing last digit from number
            number = number / 10;
        }

        // Declaring variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Looping through the digits array to find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                // Updating second largest before updating largest
                secondLargest = largest;
                largest = digits[i];
            } 
			else if (digits[i] > secondLargest && digits[i] != largest) {
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
