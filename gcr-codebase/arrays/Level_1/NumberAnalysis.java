import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        // Defining an integer array of 5 elements
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Looping through the array to analyze each number
        for (int i = 0; i < numbers.length; i++) {

            // Checking if the number is positive
            if (numbers[i] > 0) {

                // Checking if the positive number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is a positive even number");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number");
                }

            // Checking if the number is negative
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }

        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        /// Comparing first and last elements of the array
        if (firstElement == lastElement) {
            System.out.println("First and last elements are equal");
        } else if (firstElement > lastElement) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }

        input.close();
    }
}
