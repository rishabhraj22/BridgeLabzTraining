import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {

        // If lengths are not equal, strings can't be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Comparison using charAt()
        boolean charAtResult = compareUsingCharAt(str1, str2);

        // Comparison using built-in equals() method
        boolean equalsResult = str1.equals(str2);

        // Displaying comparison
        System.out.println("\nResult using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);

        // Checking if both results are same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println("Both methods give DIFFERENT results.");
        }

        sc.close();
    }
}
