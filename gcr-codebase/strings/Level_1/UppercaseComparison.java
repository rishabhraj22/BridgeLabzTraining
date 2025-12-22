import java.util.Scanner;

public class UppercaseComparison {

    // Method to convert text to uppercase
    public static String convertToUpperCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result += ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the complete text: ");
        String text = sc.nextLine();

        // Manual uppercase conversion
        String manualUpper = convertToUpperCase(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Comparing both results
        boolean result = compareStrings(manualUpper, builtInUpper);

        // Displaying results
        System.out.println("\nUppercase using charAt(): " + manualUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
