import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {

        int start = 5;
        int end = 2;

        // Explicitly throwing IllegalArgumentException
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index");
        }

        System.out.println(text.substring(start, end));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        int start = 5;
        int end = 2;

        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index");
            }

            System.out.println(text.substring(start, end));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Reason: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Generating the Exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Program terminated due to RuntimeException.");
        }

        // Handling the Exception
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);

        sc.close();
    }
}
