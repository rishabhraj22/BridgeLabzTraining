import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Checking palindrome
        if (isPalindrome(input)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }

    // Method to check palindrome
    public static boolean isPalindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return str.equals(reverse);
    }
}
