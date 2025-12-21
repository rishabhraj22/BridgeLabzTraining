import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        number = Math.abs(number);
        int count = 0;

        if (number == 0) return 1;

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        int index = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[index++] = digits[i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if number is Palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if number is Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Counting digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Storing digits
        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Reversing digits
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversed));

        // Comparing arrays
        System.out.println("Digits and Reversed are equal: " +
                compareArrays(digits, reversed));

        // Checking Palindrome
        System.out.println("Is Palindrome Number: " + isPalindrome(digits));

        // Checking Duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        sc.close();
    }
}
