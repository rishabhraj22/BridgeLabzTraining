import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Checking whether the number is a natural number
        if (number <= 0) {

            System.out.println("Please enter a natural number");

            // Exiting the program
            input.close();
            return;
        }

        // Creating integer arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Declaring index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Using for loop to iterate from 1 to the given number
        for (int i = 1; i <= number; i++) {

            // Checking if the number is even
            if (i % 2 == 0) {

                evenNumbers[evenIndex] = i;
                evenIndex++;

            } else {

                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Printing odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(oddNumbers[i]);
        }

        // Printing even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenNumbers[i]);
        }

        input.close();
    }
}
