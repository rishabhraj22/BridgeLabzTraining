import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index goes out of range
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        int manualLength = findLength(text);

        // Built-in method
        int builtInLength = text.length();

        // Displaying results
        System.out.println("\nLength without using length(): " + manualLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}
