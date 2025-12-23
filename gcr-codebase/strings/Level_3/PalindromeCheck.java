import java.util.Scanner;

public class PalindromeCheck {

    // Using start and end index comparison
    public static boolean isPalindromeUsingLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Using Recursion
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Using Character Arrays

    // Method to reverse a string using charAt()
    public static char[] reverseString(String text) {

        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    // Method to check palindrome using arrays
    public static boolean isPalindromeUsingArrays(String text) {

        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeUsingLoop(text);
        boolean result2 = isPalindromeUsingRecursion(text, 0, text.length() - 1);
        boolean result3 = isPalindromeUsingArrays(text);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("--------------------------------");
        System.out.println("Logic 1 (Loop Method): " + result1);
        System.out.println("Logic 2 (Recursion): " + result2);
        System.out.println("Logic 3 (Array Method): " + result3);

        sc.close();
    }
}
