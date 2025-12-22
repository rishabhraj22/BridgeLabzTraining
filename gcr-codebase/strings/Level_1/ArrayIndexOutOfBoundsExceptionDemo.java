import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {

        // Accessing index beyond array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            // Accessing index beyond array length
            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Reason: Invalid index accessed in array.");

        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        // Taking names input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // Generating the Exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Program terminated due to RuntimeException.");
        }

        // Handling the Exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);

        sc.close();
    }
}
